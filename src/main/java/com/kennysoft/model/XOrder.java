package com.kennysoft.model;

import sun.awt.geom.AreaOp;

public class XOrder {
    String field;
    XOrderStyle  style;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public XOrderStyle getStyle() {
        return style;
    }

    public void setStyle(XOrderStyle style) {
        this.style = style;
    }

    @Override
    public String  toString()
    {
        return String.format("%s  %s",field,style);
    }

    public XOrder()
    {
        this.field = "id";
        this.style = XOrderStyle.ASC;
    }
    public XOrder(String _fld,XOrderStyle _style)
    {
        this.field = _fld;
        this.style = _style;
    }

}
