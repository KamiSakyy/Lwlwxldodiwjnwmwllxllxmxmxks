package com.github.domain.searchandfilter.filters.data;

import java.util.ArrayList;
import java.util.List;
import k71.k;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final v01.d a(List list) {
        v01.d dVar;
        k.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof RepositoryTypeFilter) {
                arrayList.add(obj);
            }
        }
        RepositoryTypeFilter repositoryTypeFilter = (RepositoryTypeFilter) m.W(arrayList);
        if (repositoryTypeFilter != null && (dVar = repositoryTypeFilter.v) != null) {
            return dVar;
        }
        RepositoryTypeFilter.Companion.getClass();
        return RepositoryTypeFilter.x;
    }
    public Object name() { return null; }
    public Object ordinal() { return null; }
    public Object s(Object p1) { return null; }
    public Object values() { return null; }
}
