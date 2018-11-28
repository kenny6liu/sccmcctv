package com.kennysoft.model;

public class XQuery {
    private  String field;
    private Object value;
    private XQueryStyle style;


    public XQuery()
    {
       this.field="id";
       this.value="0";
       this.style = XQueryStyle.GreaterThan;
    }
    public XQuery(String _field,Object _value,XQueryStyle _style)
    {
        this.field = _field;
        this.value = _value;
        this.style =_style;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public XQueryStyle getStyle() {
        return style;
    }

    public void setStyle(XQueryStyle style) {
        this.style = style;
    }
}
