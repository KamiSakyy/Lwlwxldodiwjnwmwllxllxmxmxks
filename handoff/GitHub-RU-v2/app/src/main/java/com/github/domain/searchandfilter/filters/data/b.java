package com.github.domain.searchandfilter.filters.data;

import bm.k;
import k81.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements k {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d l(String str) {
        bm.h hVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            hVar = (bm.h) bVar.a(str, new z("com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter.Value", bm.h.values()));
        }
        DiscussionUserRelationshipFilter.Companion.getClass();
        hVar = DiscussionUserRelationshipFilter.x;
        return new DiscussionUserRelationshipFilter(hVar);
    }
}
