package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ v1 e;

    public /* synthetic */ s1(v1 v1Var, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = v1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                v1 v1Var = this.e;
                v1Var.f.B();
                o oVar = v1Var.f.t;
                o4.U(oVar);
                return oVar.v0(this.b, this.c, this.d);
            case 1:
                v1 v1Var2 = this.e;
                v1Var2.f.B();
                o oVar2 = v1Var2.f.t;
                o4.U(oVar2);
                return oVar2.v0(this.b, this.c, this.d);
            case 2:
                v1 v1Var3 = this.e;
                v1Var3.f.B();
                o oVar3 = v1Var3.f.t;
                o4.U(oVar3);
                return oVar3.z0(this.b, this.c, this.d);
            default:
                v1 v1Var4 = this.e;
                v1Var4.f.B();
                o oVar4 = v1Var4.f.t;
                o4.U(oVar4);
                return oVar4.z0(this.b, this.c, this.d);
        }
    }
}
