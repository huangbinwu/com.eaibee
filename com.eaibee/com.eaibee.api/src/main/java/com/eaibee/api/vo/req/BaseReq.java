package com.eaibee.api.vo.req;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * @date
 */
@Data
public class BaseReq<T> implements Serializable {

   private T reqItem;


}
