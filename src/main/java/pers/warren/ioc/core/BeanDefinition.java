package pers.warren.ioc.core;

import lombok.Data;
import pers.warren.ioc.enums.BeanType;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Data
public class BeanDefinition {

    /**
     * bean名称
     */
    protected String name;

    /**
     * bean的类型
     */
    protected Class<?> clz;

    /**
     * 是否单例
     */
    protected boolean singleton;

    /**
     * bean类型
     */
    protected BeanType beanType;

    /**
     * 创建Bean方法
     */
    protected Object invokeFunction;

    /**
     * 用于@Bean生成的bean源
     */
    protected String invokeSource;

    /**
     * 增强扩展预留
     */
    protected List<PropertyValue> propertyValues;

    /**
     * 标注了@Autowired的字段
     */
    protected List<Field> autowiredFieldInject;

    /**
     * 标注了@Resource的字段
     */
    protected List<Field> resourceFieldInject;

    /**
     * 标注了@Value的字段
     */
    protected List<ValueField> valueFiledInject;

    /**
     * 用于创建的beanFactory类型
     */
    protected Class<?>  beanFactoryClass;

    /**
     * 使用那个factoryBean去getObject
     */
    protected Class<?> factoryBeanClass;

    protected BeanDefinition() {
        this.singleton = true;
    }

    /**
     * bean注册器
     */
    protected BeanRegister register;

    /**
     * 扩展字段
     */
    protected Map<String,BeanDefinitionExtendedField> extendedFields;
}
