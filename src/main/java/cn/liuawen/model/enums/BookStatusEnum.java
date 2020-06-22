package cn.liuawen.model.enums;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
public enum BookStatusEnum {

  NORMAL(0),  //正常
  DELETE(1),  //删除
  RECOMMENDED(2), //推荐
  ;

  private int value;

  BookStatusEnum(int value){
    this.value = value;
  }

  public int getValue(){
    return value;
  }

}
