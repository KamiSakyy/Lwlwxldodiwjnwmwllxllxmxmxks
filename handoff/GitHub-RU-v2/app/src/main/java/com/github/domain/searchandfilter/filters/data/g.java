package com.github.domain.searchandfilter.filters.data;

import bm.k;
import k81.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements k {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d l(String str) {
        v01.d dVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            dVar = (v01.d) bVar.a(str, new z("com.github.service.repository.filter.RepositoryType", v01.d.values()));
        }
        RepositoryTypeFilter.Companion.getClass();
        dVar = RepositoryTypeFilter.x;
        return new RepositoryTypeFilter(dVar);
    }
    public Object name() { return null; }
}
