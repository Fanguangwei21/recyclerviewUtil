package com.fan.recyclerviewutil.util;

import java.util.List;

public interface Tree<T extends Tree> {

    int getLevel();

    List<T> getChilds();

    boolean isExpand();

}
