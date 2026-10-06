package fz;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.InteractionType;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import java.time.ZonedDateTime;
import kotlin.NoWhenBranchMatchedException;
import lz.a0;
import lz.b0;
import lz.j0;
import lz.k0;
import lz.l0;
import lz.m0;
import lz.n0;
import lz.o;
import lz.p;
import lz.q;
import lz.r;
import lz.t;
import lz.u;
import lz.v;
import lz.w;
import lz.x;
import lz.z;
import m10.jq;
import m10.t3;
import m10.ya0;
import m10.zd;
import w8.s;
import yz0.a5;
import yz0.c3;
import yz0.c5;
import yz0.d3;
import yz0.e3;
import yz0.g3;
import yz0.h3;
import yz0.i3;
import yz0.m4;
import yz0.n4;
import yz0.o4;
import yz0.p4;
import yz0.q4;
import yz0.r4;
import yz0.s4;
import yz0.t4;
import yz0.u4;
import yz0.v4;
import yz0.w4;
import yz0.x4;
import yz0.z2;
import yz0.z4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements z2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final ZonedDateTime h;
    public final c5 i;
    public final boolean j;
    public final boolean k;
    public final i3 l;
    public final boolean m;
    public final SubscriptionState n;
    public final SubscriptionState o;
    public final o.b p;
    public final NotificationReasonState q;

    /* JADX WARN: Removed duplicated region for block: B:166:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(lz.e eVar) {
        o oVar;
        boolean z;
        boolean z2;
        d3 d3Var;
        boolean z3;
        d3 d3Var2;
        boolean z4;
        c5 c5Var;
        n4 n4Var;
        n4 o4Var;
        jq jqVar;
        NotificationReasonState notificationReasonState;
        w wVar;
        ya0 ya0Var;
        lz.k kVar;
        k71.k.g(eVar, "node");
        a0 a0Var = eVar.m;
        String str = eVar.a;
        String str2 = eVar.b;
        String str3 = eVar.c;
        b0 b0Var = eVar.o;
        String str4 = (b0Var == null || (kVar = b0Var.f) == null) ? (b0Var == null || (oVar = b0Var.g) == null) ? null : oVar.h : kVar.g;
        String str5 = eVar.l;
        boolean z5 = eVar.d;
        int i = eVar.e;
        ZonedDateTime zonedDateTime = eVar.f;
        n0 n0Var = eVar.h;
        String str6 = n0Var != null ? n0Var.b : "";
        Avatar A = s.A(n0Var != null ? n0Var.d : null);
        String str7 = eVar.i;
        c5 c5Var2 = new c5((InteractionType) null, str6, A, str7 == null ? "" : str7, 1);
        boolean z6 = eVar.j;
        boolean z7 = eVar.k;
        if ((a0Var != null ? a0Var.c : null) != null) {
            z2 = z7;
            q qVar = a0Var.c;
            z = z6;
            d3Var = new d3(qVar.b.b, qVar.c);
        } else {
            z = z6;
            z2 = z7;
            if ((a0Var != null ? a0Var.d : null) != null) {
                d3Var = new h3(a0Var.d.a);
            } else {
                if ((a0Var != null ? a0Var.e : null) != null) {
                    x xVar = a0Var.e;
                    d3Var = new e3(xVar.a.a, xVar.b);
                } else {
                    if ((a0Var != null ? a0Var.f : null) != null) {
                        d3Var = new c3(a0Var.f.a);
                    } else {
                        g3.Companion.getClass();
                        d3Var = g3.a;
                    }
                }
            }
        }
        int ordinal = eVar.g.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            z3 = true;
            SubscriptionState y0 = (a0Var != null || (wVar = a0Var.b) == null || (ya0Var = wVar.b) == null) ? null : i4.y0(ya0Var);
            SubscriptionState subscriptionState = (y0 != null ? -1 : k.a[y0.ordinal()]) != 1 ? SubscriptionState.IGNORED : SubscriptionState.UNSUBSCRIBED;
            SubscriptionState subscriptionState2 = SubscriptionState.SUBSCRIBED;
            if ((b0Var == null ? b0Var.b : null) == null) {
                lz.h hVar = b0Var.b;
                z4 = z3;
                d3Var2 = d3Var;
                n4Var = new n4(hVar.a, hVar.b, hVar.c);
            } else {
                d3Var2 = d3Var;
                z4 = z3;
                if ((b0Var != null ? b0Var.c : null) == null) {
                    if ((b0Var != null ? b0Var.d : null) != null) {
                        lz.g gVar = b0Var.d;
                        String str8 = gVar.a;
                        c5Var = c5Var2;
                        String str9 = gVar.b;
                        CheckStatusState d0 = d5.d0(gVar.d);
                        t3 t3Var = b0Var.d.c;
                        n4Var = new m4(str8, str9, d0, t3Var != null ? i4.w0(t3Var) : null);
                    } else {
                        c5Var = c5Var2;
                        if ((b0Var != null ? b0Var.e : null) != null) {
                            z zVar = b0Var.e;
                            o4Var = new a5(zVar.c, zVar.a, zVar.b, zVar.d.a, zVar.e.a);
                        } else {
                            if ((b0Var != null ? b0Var.f : null) != null) {
                                lz.k kVar2 = b0Var.f;
                                String str10 = kVar2.a;
                                String str11 = kVar2.b;
                                int i2 = kVar2.c;
                                IssueState O = i21.a.O(kVar2.d);
                                lz.k kVar3 = b0Var.f;
                                m0 m0Var = kVar3.e;
                                o4Var = new q4(str10, str11, i2, O, m0Var.b.b, m0Var.a, sy.w.w(kVar3.f));
                            } else {
                                if ((b0Var != null ? b0Var.g : null) != null) {
                                    o oVar2 = b0Var.g;
                                    String str12 = oVar2.a;
                                    String str13 = oVar2.b;
                                    boolean z8 = oVar2.c;
                                    int i3 = oVar2.d;
                                    PullRequestState C = a.a.C(oVar2.e);
                                    o oVar3 = b0Var.g;
                                    j0 j0Var = oVar3.f;
                                    o4Var = new r4(str12, str13, z8, i3, C, j0Var.b.b, j0Var.a, oVar3.g);
                                } else {
                                    if ((b0Var != null ? b0Var.h : null) != null) {
                                        p pVar = b0Var.h;
                                        String str14 = pVar.a;
                                        String str15 = pVar.b;
                                        String str16 = pVar.c;
                                        k0 k0Var = pVar.d;
                                        o4Var = new s4(str14, str15, str16, k0Var.c.b, k0Var.b);
                                    } else {
                                        if ((b0Var != null ? b0Var.i : null) != null) {
                                            t tVar = b0Var.i;
                                            n4Var = new v4(tVar.a, tVar.b);
                                        } else {
                                            if ((b0Var != null ? b0Var.j : null) != null) {
                                                u uVar = b0Var.j;
                                                n4Var = new w4(uVar.a, uVar.b);
                                            } else {
                                                if ((b0Var != null ? b0Var.l : null) != null) {
                                                    lz.i iVar = b0Var.l;
                                                    String str17 = iVar.a;
                                                    String str18 = iVar.b;
                                                    lz.a aVar = iVar.e;
                                                    String str19 = aVar != null ? aVar.a : null;
                                                    boolean z9 = !(str19 == null || t71.p.T(str19));
                                                    lz.i iVar2 = b0Var.l;
                                                    int i4 = iVar2.c;
                                                    l0 l0Var = iVar2.f;
                                                    String str20 = l0Var.b.b;
                                                    String str21 = l0Var.a;
                                                    zd zdVar = iVar2.d;
                                                    o4Var = new o4(str17, str18, z9, i4, str20, str21, zdVar != null ? sy.w.y(zdVar) : null);
                                                } else {
                                                    if ((b0Var != null ? b0Var.k : null) != null) {
                                                        r rVar = b0Var.k;
                                                        n4Var = new t4(rVar.a, rVar.b);
                                                    } else {
                                                        if ((b0Var != null ? b0Var.m : null) != null) {
                                                            lz.s sVar = b0Var.m;
                                                            String str22 = sVar.a;
                                                            String str23 = sVar.b;
                                                            n4Var = new u4(str22, str23 == null ? "" : str23);
                                                        } else {
                                                            if ((b0Var != null ? b0Var.n : null) != null) {
                                                                v vVar = b0Var.n;
                                                                String str24 = vVar.a;
                                                                String str25 = vVar.b;
                                                                n4Var = new x4(str24, str25 == null ? "" : str25);
                                                            } else {
                                                                n4Var = z4.t;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n4Var = o4Var;
                    }
                    jqVar = eVar.n;
                    switch (jqVar == null ? -1 : bz.a.a[jqVar.ordinal()]) {
                        case -1:
                        case 17:
                        case 18:
                        case 19:
                            notificationReasonState = NotificationReasonState.UNKNOWN;
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            notificationReasonState = NotificationReasonState.ASSIGN;
                            break;
                        case 2:
                            notificationReasonState = NotificationReasonState.AUTHOR;
                            break;
                        case 3:
                            notificationReasonState = NotificationReasonState.COMMENT;
                            break;
                        case 4:
                            notificationReasonState = NotificationReasonState.INVITATION;
                            break;
                        case 5:
                            notificationReasonState = NotificationReasonState.MANUAL;
                            break;
                        case 6:
                            notificationReasonState = NotificationReasonState.MENTION;
                            break;
                        case 7:
                            notificationReasonState = NotificationReasonState.REVIEW_REQUESTED;
                            break;
                        case 8:
                            notificationReasonState = NotificationReasonState.SECURITY_ADVISORY_CREDIT;
                            break;
                        case 9:
                            notificationReasonState = NotificationReasonState.SECURITY_ALERT;
                            break;
                        case 10:
                            notificationReasonState = NotificationReasonState.STATE_CHANGE;
                            break;
                        case 11:
                            notificationReasonState = NotificationReasonState.SUBSCRIBED;
                            break;
                        case 12:
                            notificationReasonState = NotificationReasonState.TEAM_MENTION;
                            break;
                        case 13:
                            notificationReasonState = NotificationReasonState.CI_ACTIVITY;
                            break;
                        case 14:
                            notificationReasonState = NotificationReasonState.APPROVAL_REQUESTED;
                            break;
                        case 15:
                            notificationReasonState = NotificationReasonState.SAVE;
                            break;
                        case 16:
                            notificationReasonState = NotificationReasonState.READY_FOR_REVIEW;
                            break;
                    }
                    k71.k.g(subscriptionState, "unsubscribeActionState");
                    k71.k.g(notificationReasonState, "reason");
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = str4;
                    this.e = str5;
                    this.f = z5;
                    this.g = i;
                    this.h = zonedDateTime;
                    this.i = c5Var;
                    this.j = z;
                    this.k = z2;
                    this.l = d3Var2;
                    this.m = z4;
                    this.n = subscriptionState;
                    this.o = subscriptionState2;
                    this.p = n4Var;
                    this.q = notificationReasonState;
                }
                lz.j jVar = b0Var.c;
                n4Var = new p4(jVar.b, jVar.a);
            }
            c5Var = c5Var2;
            jqVar = eVar.n;
            switch (jqVar == null ? -1 : bz.a.a[jqVar.ordinal()]) {
            }
            k71.k.g(subscriptionState, "unsubscribeActionState");
            k71.k.g(notificationReasonState, "reason");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z5;
            this.g = i;
            this.h = zonedDateTime;
            this.i = c5Var;
            this.j = z;
            this.k = z2;
            this.l = d3Var2;
            this.m = z4;
            this.n = subscriptionState;
            this.o = subscriptionState2;
            this.p = n4Var;
            this.q = notificationReasonState;
        }
        z3 = false;
        if (a0Var != null) {
        }
        if ((y0 != null ? -1 : k.a[y0.ordinal()]) != 1) {
        }
        SubscriptionState subscriptionState22 = SubscriptionState.SUBSCRIBED;
        if ((b0Var == null ? b0Var.b : null) == null) {
        }
        c5Var = c5Var2;
        jqVar = eVar.n;
        switch (jqVar == null ? -1 : bz.a.a[jqVar.ordinal()]) {
        }
        k71.k.g(subscriptionState, "unsubscribeActionState");
        k71.k.g(notificationReasonState, "reason");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z5;
        this.g = i;
        this.h = zonedDateTime;
        this.i = c5Var;
        this.j = z;
        this.k = z2;
        this.l = d3Var2;
        this.m = z4;
        this.n = subscriptionState;
        this.o = subscriptionState22;
        this.p = n4Var;
        this.q = notificationReasonState;
    }

    public final i3 a() {
        return this.l;
    }

    public final int b() {
        return this.g;
    }

    public final ZonedDateTime c() {
        return this.h;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e) && this.f == hVar.f && this.g == hVar.g && k71.k.b(this.h, hVar.h) && k71.k.b(this.i, hVar.i) && this.j == hVar.j && this.k == hVar.k && k71.k.b(this.l, hVar.l) && this.m == hVar.m && this.n == hVar.n && this.o == hVar.o && k71.k.b(this.p, hVar.p) && this.q == hVar.q;
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.f;
    }

    public final String getId() {
        return this.a;
    }

    public final String getTitle() {
        return this.c;
    }

    public final String getUrl() {
        return this.e;
    }

    public final o.b h() {
        return this.p;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        String str2 = this.d;
        int hashCode2 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int a = com.github.rudroid.m0.a(this.h, s0.b(this.g, x.i.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31), 31);
        c5 c5Var = this.i;
        int hashCode3 = (this.n.hashCode() + x.i.e((this.l.hashCode() + x.i.e(x.i.e((a + (c5Var == null ? 0 : c5Var.hashCode())) * 31, 31, this.j), 31, this.k)) * 31, 31, this.m)) * 31;
        SubscriptionState subscriptionState = this.o;
        int hashCode4 = subscriptionState != null ? subscriptionState.hashCode() : 0;
        return this.q.hashCode() + ((this.p.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
    }

    public final NotificationReasonState i() {
        return this.q;
    }

    public final boolean isDone() {
        return this.j;
    }

    public final SubscriptionState j() {
        return this.n;
    }

    public final c5 k() {
        return this.i;
    }

    public final SubscriptionState l() {
        return this.o;
    }

    public final String toString() {
        StringBuilder o = s0.o("ApolloNotification(id=", this.a, ", threadType=", this.b, ", title=");
        f1.e.x(o, this.c, ", titleHTML=", this.d, ", url=");
        com.github.rudroid.m0.x(o, this.e, ", isUnread=", this.f, ", itemCount=");
        o.append(this.g);
        o.append(", lastUpdatedAt=");
        o.append(this.h);
        o.append(", summary=");
        o.append(this.i);
        o.append(", isDone=");
        o.append(this.j);
        o.append(", isSaved=");
        o.append(this.k);
        o.append(", owner=");
        o.append(this.l);
        o.append(", isSubscribed=");
        o.append(this.m);
        o.append(", unsubscribeActionState=");
        o.append(this.n);
        o.append(", subscribeActionState=");
        o.append(this.o);
        o.append(", subject=");
        o.append(this.p);
        o.append(", reason=");
        o.append(this.q);
        o.append(")");
        return o.toString();
    }
}
