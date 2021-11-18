package com.qx.sf.build.utils.encrypt;

import cn.hutool.crypto.SecureUtil;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 自定义加解密mybatis javaTypeHandler
 *
 * @author xiejl
 */
public class EncryptTypeHandler extends BaseTypeHandler<EncryptType> {

    public static final cn.hutool.crypto.symmetric.DES DES = SecureUtil.des("3O8l$#1@".getBytes());

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, EncryptType parameter, JdbcType jdbcType) throws SQLException {
        if(!ObjectUtils.isEmpty(parameter.getAttribute())){
            ps.setString(i, DES.encryptBase64(parameter.getAttribute()));
        }else{
            ps.setString(i, null);
        }
    }

    @Override
    public EncryptType getNullableResult(ResultSet rs, String columnName) throws SQLException {
        final String result = rs.getString(columnName);
        return this.decrypt(result);
    }

    @Override
    public EncryptType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        final String result = rs.getString(columnIndex);
        return this.decrypt(result);
    }

    @Override
    public EncryptType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        final String result = cs.getString(columnIndex);
        return this.decrypt(result);
    }

    private EncryptType decrypt(final String dbData){
        if (StringUtils.isEmpty(dbData)) {
            return new EncryptType(dbData);
        }
        return new EncryptType(DES.decryptStr(dbData));
    }

}
