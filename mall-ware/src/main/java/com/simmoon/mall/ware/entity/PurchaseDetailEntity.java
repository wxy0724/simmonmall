package com.simmoon.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 09:36:21
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 閲囪喘鍗昳d
	 */
	private Long purchaseId;
	/**
	 * 閲囪喘鍟嗗搧id
	 */
	private Long skuId;
	/**
	 * 閲囪喘鏁伴噺
	 */
	private Integer skuNum;
	/**
	 * 閲囪喘閲戦��
	 */
	private BigDecimal skuPrice;
	/**
	 * 浠撳簱id
	 */
	private Long wareId;
	/**
	 * 鐘舵€乕0鏂板缓锛�1宸插垎閰嶏紝2姝ｅ湪閲囪喘锛�3宸插畬鎴愶紝4閲囪喘澶辫触]
	 */
	private Integer status;

}
