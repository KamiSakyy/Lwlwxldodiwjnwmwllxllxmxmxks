package com.github.domain.searchandfilter.filters.data;

import bm.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements k {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        if (r3 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d l(String str) {
        on.g gVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            gVar = (on.g) bVar.a(str, on.g.Companion.serializer());
        }
        AgentTasksSortFilter.Companion.getClass();
        gVar = AgentTasksSortFilter.x;
        return new AgentTasksSortFilter(gVar);
    }
    public Object name() { return null; }
    public static KSerializer z(Object p1) { return null; }
}
