package com.github.domain.database.serialization;

import f1.u5;
import fk.f;
import g81.e;
import sy.w;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b implements f {
    public static final FilterPersistedKey$Companion Companion = new FilterPersistedKey$Companion();
    public static final Object s = w.s(i.r, new u5(13));
    public final String r;

    @Override // fk.f
    public final String getKey() {
        return this.r;
    }

    public b(String str, int i) {
        this.r = str;
    }
}
