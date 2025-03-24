package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XianhuaCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 鲜花收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xianhua_collection")
public class XianhuaCollectionView extends XianhuaCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String xianhuaCollectionValue;

	//级联表 鲜花
		/**
		* 鲜花名称
		*/

		@ColumnInfo(comment="鲜花名称",type="varchar(200)")
		private String xianhuaName;
		/**
		* 鲜花编号
		*/

		@ColumnInfo(comment="鲜花编号",type="varchar(200)")
		private String xianhuaUuidNumber;
		/**
		* 鲜花照片
		*/

		@ColumnInfo(comment="鲜花照片",type="varchar(200)")
		private String xianhuaPhoto;
		/**
		* 花语
		*/

		@ColumnInfo(comment="花语",type="varchar(200)")
		private String xianhuaHuayu;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 鲜花类型
		*/
		@ColumnInfo(comment="鲜花类型",type="int(11)")
		private Integer xianhuaTypes;
			/**
			* 鲜花类型的值
			*/
			@ColumnInfo(comment="鲜花类型的字典表值",type="varchar(200)")
			private String xianhuaValue;
		/**
		* 鲜花数量
		*/

		@ColumnInfo(comment="鲜花数量",type="int(11)")
		private Integer xianhuaKucunNumber;
		/**
		* 鲜花原价
		*/
		@ColumnInfo(comment="鲜花原价",type="decimal(10,2)")
		private Double xianhuaOldMoney;
		/**
		* 现价
		*/
		@ColumnInfo(comment="现价",type="decimal(10,2)")
		private Double xianhuaNewMoney;
		/**
		* 鲜花热度
		*/

		@ColumnInfo(comment="鲜花热度",type="int(11)")
		private Integer xianhuaClicknum;
		/**
		* 鲜花介绍
		*/

		@ColumnInfo(comment="鲜花介绍",type="longtext")
		private String xianhuaContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer xianhuaDelete;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public XianhuaCollectionView() {

	}

	public XianhuaCollectionView(XianhuaCollectionEntity xianhuaCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, xianhuaCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getXianhuaCollectionValue() {
		return xianhuaCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setXianhuaCollectionValue(String xianhuaCollectionValue) {
		this.xianhuaCollectionValue = xianhuaCollectionValue;
	}


	//级联表的get和set 鲜花

		/**
		* 获取： 鲜花名称
		*/
		public String getXianhuaName() {
			return xianhuaName;
		}
		/**
		* 设置： 鲜花名称
		*/
		public void setXianhuaName(String xianhuaName) {
			this.xianhuaName = xianhuaName;
		}

		/**
		* 获取： 鲜花编号
		*/
		public String getXianhuaUuidNumber() {
			return xianhuaUuidNumber;
		}
		/**
		* 设置： 鲜花编号
		*/
		public void setXianhuaUuidNumber(String xianhuaUuidNumber) {
			this.xianhuaUuidNumber = xianhuaUuidNumber;
		}

		/**
		* 获取： 鲜花照片
		*/
		public String getXianhuaPhoto() {
			return xianhuaPhoto;
		}
		/**
		* 设置： 鲜花照片
		*/
		public void setXianhuaPhoto(String xianhuaPhoto) {
			this.xianhuaPhoto = xianhuaPhoto;
		}

		/**
		* 获取： 花语
		*/
		public String getXianhuaHuayu() {
			return xianhuaHuayu;
		}
		/**
		* 设置： 花语
		*/
		public void setXianhuaHuayu(String xianhuaHuayu) {
			this.xianhuaHuayu = xianhuaHuayu;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 鲜花类型
		*/
		public Integer getXianhuaTypes() {
			return xianhuaTypes;
		}
		/**
		* 设置： 鲜花类型
		*/
		public void setXianhuaTypes(Integer xianhuaTypes) {
			this.xianhuaTypes = xianhuaTypes;
		}


			/**
			* 获取： 鲜花类型的值
			*/
			public String getXianhuaValue() {
				return xianhuaValue;
			}
			/**
			* 设置： 鲜花类型的值
			*/
			public void setXianhuaValue(String xianhuaValue) {
				this.xianhuaValue = xianhuaValue;
			}

		/**
		* 获取： 鲜花数量
		*/
		public Integer getXianhuaKucunNumber() {
			return xianhuaKucunNumber;
		}
		/**
		* 设置： 鲜花数量
		*/
		public void setXianhuaKucunNumber(Integer xianhuaKucunNumber) {
			this.xianhuaKucunNumber = xianhuaKucunNumber;
		}

		/**
		* 获取： 鲜花原价
		*/
		public Double getXianhuaOldMoney() {
			return xianhuaOldMoney;
		}
		/**
		* 设置： 鲜花原价
		*/
		public void setXianhuaOldMoney(Double xianhuaOldMoney) {
			this.xianhuaOldMoney = xianhuaOldMoney;
		}

		/**
		* 获取： 现价
		*/
		public Double getXianhuaNewMoney() {
			return xianhuaNewMoney;
		}
		/**
		* 设置： 现价
		*/
		public void setXianhuaNewMoney(Double xianhuaNewMoney) {
			this.xianhuaNewMoney = xianhuaNewMoney;
		}

		/**
		* 获取： 鲜花热度
		*/
		public Integer getXianhuaClicknum() {
			return xianhuaClicknum;
		}
		/**
		* 设置： 鲜花热度
		*/
		public void setXianhuaClicknum(Integer xianhuaClicknum) {
			this.xianhuaClicknum = xianhuaClicknum;
		}

		/**
		* 获取： 鲜花介绍
		*/
		public String getXianhuaContent() {
			return xianhuaContent;
		}
		/**
		* 设置： 鲜花介绍
		*/
		public void setXianhuaContent(String xianhuaContent) {
			this.xianhuaContent = xianhuaContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getXianhuaDelete() {
			return xianhuaDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setXianhuaDelete(Integer xianhuaDelete) {
			this.xianhuaDelete = xianhuaDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "XianhuaCollectionView{" +
			", xianhuaCollectionValue=" + xianhuaCollectionValue +
			", xianhuaName=" + xianhuaName +
			", xianhuaUuidNumber=" + xianhuaUuidNumber +
			", xianhuaPhoto=" + xianhuaPhoto +
			", xianhuaHuayu=" + xianhuaHuayu +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", xianhuaKucunNumber=" + xianhuaKucunNumber +
			", xianhuaOldMoney=" + xianhuaOldMoney +
			", xianhuaNewMoney=" + xianhuaNewMoney +
			", xianhuaClicknum=" + xianhuaClicknum +
			", xianhuaContent=" + xianhuaContent +
			", xianhuaDelete=" + xianhuaDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			"} " + super.toString();
	}
}
