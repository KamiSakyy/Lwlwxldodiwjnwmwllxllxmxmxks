package com.github.rudroid.utilities.ui.emojipicker;

import com.github.rudroid.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.c s;
    public final /* synthetic */ Object t;

    public /* synthetic */ c(int i, j71.c cVar, Object obj) {
        this.r = i;
        this.s = cVar;
        this.t = obj;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                this.s.k((y) this.t);
                break;
            default:
                this.s.k(":" + ((String) this.t) + ":");
                break;
        }
        return a0.a;
    }
}
