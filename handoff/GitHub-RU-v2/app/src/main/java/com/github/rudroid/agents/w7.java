package com.github.rudroid.agents;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public v01.d f8444a;

    /* renamed from: b, reason: collision with root package name */
    public com.github.rudroid.searchandfilter.e0 f8445b;

    /* renamed from: c, reason: collision with root package name */
    public String f8446c;

    public w7(v01.d dVar, com.github.rudroid.searchandfilter.e0 e0Var) {
        String str;
        k71.k.g(e0Var, "fullQuery");
        this.f8444a = dVar;
        this.f8445b = e0Var;
        switch (dVar.ordinal()) {
            case k5.f.J /* 0 */:
                str = "";
                break;
            case 1:
                str = "archived:true ";
                break;
            case 2:
                str = "fork:only ";
                break;
            case 3:
                str = "mirror:true ";
                break;
            case 4:
                str = "is:private ";
                break;
            case 5:
                str = "is:public ";
                break;
            case 6:
                str = "mirror:false fork:false archived:false ";
                break;
            case 7:
                str = "template:true ";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f8446c = x.i.f(str, e0Var.a);
    }

    public static w7 a(w7 w7Var, v01.d dVar, com.github.rudroid.searchandfilter.e0 e0Var, int i) {
        if ((i & 1) != 0) {
            dVar = w7Var.f8444a;
        }
        if ((i & 2) != 0) {
            e0Var = w7Var.f8445b;
        }
        w7Var.getClass();
        k71.k.g(e0Var, "fullQuery");
        return new w7(dVar, e0Var);
    }

    public final boolean b() {
        return this.f8445b.a.length() == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return this.f8444a == w7Var.f8444a && k71.k.b(this.f8445b, w7Var.f8445b);
    }

    public final int hashCode() {
        return this.f8445b.hashCode() + (this.f8444a.hashCode() * 31);
    }

    public final String toString() {
        return "TypedRepoQuery(repoType=" + this.f8444a + ", fullQuery=" + this.f8445b + ")";
    }
}
