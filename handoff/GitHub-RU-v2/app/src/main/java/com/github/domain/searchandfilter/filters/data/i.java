package com.github.domain.searchandfilter.filters.data;

import bm.l;
import bm.p;
import sy.w;
import w80.n3;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i extends d {
    public static final StatusFilter$Companion Companion = new StatusFilter$Companion();
    public static final StatusFilter$Inbox w;
    public static final n3 x;
    public static final Object y;
    public String v;

    static {
        w61.i iVar = w61.i.r;
        w.s(iVar, new p(23));
        w = StatusFilter$Inbox.INSTANCE;
        x = new n3(2);
        y = w.s(iVar, new p(24));
    }

    public i(String str) {
        super(l.O, "FILTER_NOTIFICATION_STATUS");
        this.v = str;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(Companion.serializer(), this);
    }
}
