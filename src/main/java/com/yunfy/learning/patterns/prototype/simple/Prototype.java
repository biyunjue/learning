package com.yunfy.learning.patterns.prototype.simple;

/**
 * @author yunfy
 */
public abstract class Prototype implements Cloneable {

    public abstract Object simpleCopy() throws CloneNotSupportedException;

}
