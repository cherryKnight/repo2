package com.pinyougou.pojo;

import java.io.Serializable;

public class TbBrand implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.id
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.name
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_brand.first_char
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    private String firstChar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_brand
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.id
     *
     * @return the value of tb_brand.id
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.id
     *
     * @param id the value for tb_brand.id
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.name
     *
     * @return the value of tb_brand.name
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.name
     *
     * @param name the value for tb_brand.name
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_brand.first_char
     *
     * @return the value of tb_brand.first_char
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    public String getFirstChar() {
        return firstChar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_brand.first_char
     *
     * @param firstChar the value for tb_brand.first_char
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar == null ? null : firstChar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_brand
     *
     * @mbg.generated Tue Nov 20 19:21:23 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", firstChar=").append(firstChar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}