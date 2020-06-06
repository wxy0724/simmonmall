package com.simmoon.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 搴撳瓨宸ヤ綔鍗�
 * 
 * @author simmoon
 * @email bryan0724@126.com
 * @date 2020-05-04 09:36:21
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * order_sn
	 */
	private String orderSn;
	/**
	 * 鏀惰揣浜�
	 */
	private String consignee;
	/**
	 * 鏀惰揣浜虹數璇�
	 */
	private String consigneeTel;
	/**
	 * 閰嶉€佸湴鍧€
	 */
	private String deliveryAddress;
	/**
	 * 璁㈠崟澶囨敞
	 */
	private String orderComment;
	/**
	 * 浠樻�炬柟寮忋€� 1:鍦ㄧ嚎浠樻�� 2:璐у埌浠樻�俱€�
	 */
	private Integer paymentWay;
	/**
	 * 浠诲姟鐘舵€�
	 */
	private Integer taskStatus;
	/**
	 * 璁㈠崟鎻忚堪
	 */
	private String orderBody;
	/**
	 * 鐗╂祦鍗曞彿
	 */
	private String trackingNo;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 浠撳簱id
	 */
	private Long wareId;
	/**
	 * 宸ヤ綔鍗曞�囨敞
	 */
	private String taskComment;

}
