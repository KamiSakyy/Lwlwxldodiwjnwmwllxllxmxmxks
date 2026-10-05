package com.github.rudroid.uitoolkit.text;

import androidx.compose.runtime.f1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class v implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ j71.c t;
    public final /* synthetic */ f1 u;

    public /* synthetic */ v(String str, j71.c cVar, f1 f1Var, int i) {
        this.r = i;
        this.s = str;
        this.t = cVar;
        this.u = f1Var;
    }

    public final Object k(Object obj) {
        l3.v vVar = (l3.v) obj;
        switch (this.r) {
            case 0:
                k71.k.g(vVar, "updatedTextFieldValue");
                this.u.setValue(vVar);
                g3.g gVar = vVar.a;
                if (!k71.k.b(this.s, gVar.s)) {
                    this.t.k(gVar.s);
                }
                break;
            default:
                k71.k.g(vVar, "newTextFieldValue");
                this.u.setValue(vVar);
                g3.g gVar2 = vVar.a;
                if (!k71.k.b(this.s, gVar2.s)) {
                    this.t.k(gVar2.s);
                }
                break;
        }
        return w61.a0.a;
    }
}
