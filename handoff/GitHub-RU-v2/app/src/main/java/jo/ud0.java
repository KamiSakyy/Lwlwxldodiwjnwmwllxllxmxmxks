package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ud0 implements aa.n0 {
    public static final rd0 Companion = new rd0();
    public final aa1.b r;
    public final aa1.b s;
    public final aa1.b t;

    public ud0(aa1.b bVar, aa1.b bVar2, aa1.b bVar3) {
        this.r = bVar;
        this.s = bVar2;
        this.t = bVar3;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.p6.a;
        List list2 = h10.p6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud0)) {
            return false;
        }
        ud0 ud0Var = (ud0) obj;
        return k71.k.b(this.r, ud0Var.r) && k71.k.b(this.s, ud0Var.s) && k71.k.b(this.t, ud0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.my.a, false);
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
        if (u0Var instanceof aa.u0) {
            fVar.z0("getsDirectMentionMobilePush");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("getsParticipatingWeb");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.t;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("getsWatchingWeb");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(f4.u("UpdateNotificationSettingsMutation(getsDirectMentionMobilePush=", this.r, ", getsParticipatingWeb=", this.s, ", getsWatchingWeb="), this.t, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
