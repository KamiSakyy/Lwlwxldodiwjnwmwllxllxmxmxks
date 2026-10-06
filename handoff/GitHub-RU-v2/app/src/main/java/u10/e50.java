package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e50 implements aaShadow.n0 {
    public static final b50 Companion = new b50();
    public aa1.b r;
    public aa1.b s;
    public aa1.b t;

    public e50(aa1.b bVar, aa1.b bVar2, aa1.b bVar3) {
        this.r = bVar;
        this.s = bVar2;
        this.t = bVar3;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.l5.a;
        List list2 = fc0.l5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e50)) {
            return false;
        }
        e50 e50Var = (e50) obj;
        return k71.k.b(this.r, e50Var.r) && k71.k.b(this.s, e50Var.s) && k71.k.b(this.t, e50Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ds.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "756bb74e2f4b86824d6d8c8c0a39ff31e97580e4024ca7004665d63600579b65";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateNotificationSettings($getsDirectMentionMobilePush: Boolean, $getsParticipatingWeb: Boolean, $getsWatchingWeb: Boolean) { updateNotificationSettings(input: { getsDirectMentionMobilePush: $getsDirectMentionMobilePush getsParticipatingWeb: $getsParticipatingWeb getsWatchingWeb: $getsWatchingWeb } ) { success } }";
    }

    public final String name() {
        return "UpdateNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("getsDirectMentionMobilePush");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("getsParticipatingWeb");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.t;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("getsWatchingWeb");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(jo.f4Shadow.u("UpdateNotificationSettingsMutation(getsDirectMentionMobilePush=", this.r, ", getsParticipatingWeb=", this.s, ", getsWatchingWeb="), this.t, ")");
    }






















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l0 {
        public l0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p {
        public p() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class xShadow {
        public x() {
        }
    }
}
