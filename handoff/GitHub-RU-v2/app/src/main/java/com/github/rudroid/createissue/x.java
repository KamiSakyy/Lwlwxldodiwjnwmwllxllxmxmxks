package com.github.rudroid.createissue;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {
    public static final a Companion = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final x f10530d;

    /* renamed from: a, reason: collision with root package name */
    public final g1 f10531a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f10532b;

    /* renamed from: c, reason: collision with root package name */
    public final com.github.rudroid.createissue.propertybar.tooltips.a f10533c;

    public static final class a {
    }

    static {
        g1.Companion.getClass();
        f10530d = new x(g1.a.a(), new u0((Object) null), null);
    }

    public x(g1 g1Var, g1 g1Var2, com.github.rudroid.createissue.propertybar.tooltips.a aVar) {
        k71.k.g(g1Var, "createIssueState");
        k71.k.g(g1Var2, "repositoryCreateIssueInformation");
        this.f10531a = g1Var;
        this.f10532b = g1Var2;
        this.f10533c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.f10531a, xVar.f10531a) && k71.k.b(this.f10532b, xVar.f10532b) && this.f10533c == xVar.f10533c;
    }

    public final int hashCode() {
        int hashCode = (this.f10532b.hashCode() + (this.f10531a.hashCode() * 31)) * 31;
        com.github.rudroid.createissue.propertybar.tooltips.a aVar = this.f10533c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "CreateIssueUiState(createIssueState=" + this.f10531a + ", repositoryCreateIssueInformation=" + this.f10532b + ", activeTooltip=" + this.f10533c + ")";
    }
}
