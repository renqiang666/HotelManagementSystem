package com.hotelsystem.utils;

/**
 * @ClassName AliPayConfig
 * @Description TODO:实现完成
 * @Author Wu Yimin
 * @Date 2018/8/4 上午12:08
 * @Version 1.0
 **/
public class AlipayConfig {

    public static String app_id = "2016091800540693";

    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC/BYlfpHsJmbMDBEN7tHthBbNWbSOa6AFZXy4N4LuhivBj9QoWneHc3J6i6EhNsxI/jLjJH0l9r1CCIyCpsiR8NROXxCcPBi/YkjF6uZQaw7oWTnMJjThduCt4YysRPfIBWWzMOwT7II72jD11vKA481P+41s+LkJM2WaEnl2qB9sYmPSZU84QPv/qt1vzpR9kla2kDFT/o831BrhyHpoZZrJW4Q0YV9qESbq1JYwA838bM4tLyALiGcEuNESLl0ahZZAm2AgLjg52ia1qx+/2C3czu3SUn71u2ctwrsQhO5zih5WdVary7HQYd9lw6HxFn4xKwKD93ISKrzxzSRQxAgMBAAECggEARSqKDVmPO3Ctwt/eV4KIUh8wSpEGHWb4ZhXypQ/EoL+gP3FQj9PnHoO75RzaYVf/uYcIubpcb+f07MovX4Kjd134lDFwOx5wYKi+xcNAf1hznvQU71Z1HGo9Q0AVLg8R+68Xl/Oe4Bdv7JHnBySflz90IIzOUvuJAi6N0mNNYu0IXo2xtHEN9NbBJrVPwM0CqaxgRvkT/JFdTq28tjYKVoPiGKiHVL3AbTzO/Pt98cU50XeZrc5aIPr8jrMwB0C/UQU0lwUY1Z4M5uTTuip8yFmJ6NhErJTlrYHVLXE7Q6z0y5GEvE+EdAwe2EZRJn33B0upYo/f29uz+Qcmgw3v4QKBgQDzxpJWb5hnlrBqzYAtygcfTXRPjJBrUEvWvUH8ahvvrVPyorNYsj6inAFBg+NlJlbUdEl71EJfETLPZY2uz4H+Sqq7/50EhNZXq+9LHhjCCopBn9wxt+F7LL5VYylthHyWvvZe3p2/eX+tig32rlN/u8sqKnZcdxfN3zxtdb4llQKBgQDImb529TUr2pOsrlTHF63i2O/Z2+ti0Rh3+7uMty2pL7N2XGZ+NSb+LkM013moMFe2xTEZGKFSnGVBd7M4ems2wb3PeAPCUM+i41qOJylEoWi3uGYCRqSlLhyN2+m+5rTgzoLRv9DrEa5V7Mveb6czrFgIeaUDFtCgF+CtyFpVLQKBgDbHjYTc6OuGQjiN21ruxjDzj8p8dMuYrKIhv11AXuy6D147z3+D9m1GD0Ywo/3L4sE1LHomFZAVZkySrob03GpPTxSV+SvVyfDDky9XIQshoTXj/XAyuPmb8V1wvhN9LR4W5XgmIF6xp85QcpjXTa4rfhkIl7ZpkLDTlFmolsUNAoGBAKlLPzfLt4T8IbcRJVEkxcZ1yO42sI+j4Z+Y3m5iRXHMZQuV7ZXDq9XGG0fkNbLgoZYJE2eXpsY+YSIAMEuQ3RzIIzWNlraOVr2kXE8t86ENC4BJaiWvktIoeUarerh2od47yqHT3TAVquivQFrIJfbxExaL+twBjC4gGKjxNnM9AoGBANtnpBSdsfABqM5jR1N75trO5WQIpZG+O89j0xIovsRb/enlF8eR2GjnD/SBfYXwO30jMW+g9ifCCJM1yVX1N82DKju7znMrtkrVBXhEy9j+TmvpiqG2HKRMH1D5Xn9OaMsOxTHX2YudWusSDlvkf54Qoh/eC7q2d4RqZOnC6CG3";

    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtNfaGcqNPq6VKY+cpV0iqH9pN6CH8mtAh4oGV1+CKdYYro0lXyj/zbTS2DQoW0RpLNws/60hMrs0793KELxAfrXj9EM3O4iv98PzLsg05hwxMRsFJtpdon4U3VifKOzLnqR1+8QSnskvyMmZCd/l73f4aSRDtdUsQq5ac1ZbnwTKISVLFzTiUInw16RQziP+ksnUMhHmsXdiI4xJXyhRaCPWkQZplEkMS4yWwMyXtvaOaFjD3FiZbiJOPrnD9jKBAHA7HrF7/pxIJUAEwLAdaHxzS3GRd88ZFUAvTqk+QfY88AX5UmJD4RCkHhqJhGzfbo307m65Yz2oDf4QOV61ZwIDAQAB";

    public static String notify_url = "http://localhost:8080/HotelManagement/alipayNotifyNotice.action";

    public static String return_url = "http://localhost:8080/HotelManagement/alipayReturnNotice.action";

    public static String sign_type = "RSA2";

    public static String charset = "utf-8";

    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}