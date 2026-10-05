package com.github.domain.searchandfilter.filters.data;

import bm.k;
import k81.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements k {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d l(String str) {
        v01.c cVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            cVar = (v01.c) bVar.a(str, new z("com.github.service.repository.filter.RepositorySortOrder", v01.c.values()));
        }
        RepositorySortFilter.Companion.getClass();
        cVar = RepositorySortFilter.x;
        return new RepositorySortFilter(cVar);
    }
}
