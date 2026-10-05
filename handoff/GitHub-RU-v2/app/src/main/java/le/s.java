package le;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.NotificationReasonState;
import java.time.ZonedDateTime;
import kotlin.NoWhenBranchMatchedException;
import yz0.a5;
import yz0.c5;
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
import yz0.y4;
import yz0.z2;
import yz0.z4;

/* loaded from: /home/user/work/p/classes.dex */
public final class s implements me.d {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f28728a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28730c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28731d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28732e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28733f;

    /* renamed from: g, reason: collision with root package name */
    public final ZonedDateTime f28734g;

    /* renamed from: h, reason: collision with root package name */
    public final i3 f28735h;
    public final c5 i;

    /* renamed from: j, reason: collision with root package name */
    public final o.b f28736j;

    /* renamed from: k, reason: collision with root package name */
    public final NotificationReasonState f28737k;
    public final String l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public final lg.b f28738n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f28739o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f28740p;

    /* renamed from: q, reason: collision with root package name */
    public final String f28741q;

    public static final class a {
    }

    public s(String str, String str2, int i, boolean z10, boolean z11, boolean z12, ZonedDateTime zonedDateTime, i3 i3Var, c5 c5Var, o.b bVar, NotificationReasonState notificationReasonState, String str3, String str4, lg.b bVar2, Integer num, a0 a0Var) {
        k71.k.g(str, "title");
        k71.k.g(zonedDateTime, "lastUpdatedAt");
        k71.k.g(i3Var, "owner");
        k71.k.g(bVar, "subject");
        k71.k.g(notificationReasonState, "reason");
        k71.k.g(str3, "id");
        k71.k.g(bVar2, "itemCountColor");
        this.f28728a = str;
        this.f28729b = str2;
        this.f28730c = i;
        this.f28731d = z10;
        this.f28732e = z11;
        this.f28733f = z12;
        this.f28734g = zonedDateTime;
        this.f28735h = i3Var;
        this.i = c5Var;
        this.f28736j = bVar;
        this.f28737k = notificationReasonState;
        this.l = str3;
        this.m = str4;
        this.f28738n = bVar2;
        this.f28739o = num;
        this.f28740p = a0Var;
        this.f28741q = str3;
    }

    public static s a(s sVar, boolean z10, boolean z11, boolean z12, a0 a0Var, int i) {
        String str = sVar.f28728a;
        String str2 = sVar.f28729b;
        int i10 = sVar.f28730c;
        boolean z13 = (i & 8) != 0 ? sVar.f28731d : z10;
        boolean z14 = (i & 16) != 0 ? sVar.f28732e : z11;
        boolean z15 = (i & 32) != 0 ? sVar.f28733f : z12;
        ZonedDateTime zonedDateTime = sVar.f28734g;
        i3 i3Var = sVar.f28735h;
        c5 c5Var = sVar.i;
        o.b bVar = sVar.f28736j;
        NotificationReasonState notificationReasonState = sVar.f28737k;
        String str3 = sVar.l;
        String str4 = sVar.m;
        lg.b bVar2 = sVar.f28738n;
        Integer num = sVar.f28739o;
        a0 a0Var2 = (i & 32768) != 0 ? sVar.f28740p : a0Var;
        k71.k.g(str, "title");
        k71.k.g(zonedDateTime, "lastUpdatedAt");
        k71.k.g(i3Var, "owner");
        k71.k.g(bVar, "subject");
        k71.k.g(notificationReasonState, "reason");
        k71.k.g(str3, "id");
        k71.k.g(bVar2, "itemCountColor");
        k71.k.g(a0Var2, "subscriptionInformation");
        return new s(str, str2, i10, z13, z14, z15, zonedDateTime, i3Var, c5Var, bVar, notificationReasonState, str3, str4, bVar2, num, a0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.f28728a, sVar.f28728a) && k71.k.b(this.f28729b, sVar.f28729b) && this.f28730c == sVar.f28730c && this.f28731d == sVar.f28731d && this.f28732e == sVar.f28732e && this.f28733f == sVar.f28733f && k71.k.b(this.f28734g, sVar.f28734g) && k71.k.b(this.f28735h, sVar.f28735h) && k71.k.b(this.i, sVar.i) && k71.k.b(this.f28736j, sVar.f28736j) && this.f28737k == sVar.f28737k && k71.k.b(this.l, sVar.l) && k71.k.b(this.m, sVar.m) && this.f28738n == sVar.f28738n && k71.k.b(this.f28739o, sVar.f28739o) && k71.k.b(this.f28740p, sVar.f28740p);
    }

    public final int hashCode() {
        int hashCode = this.f28728a.hashCode() * 31;
        String str = this.f28729b;
        int hashCode2 = (this.f28735h.hashCode() + m0.a(this.f28734g, x.i.e(x.i.e(x.i.e(s0.b(this.f28730c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f28731d), 31, this.f28732e), 31, this.f28733f), 31)) * 31;
        c5 c5Var = this.i;
        int i = h1.i((this.f28737k.hashCode() + ((this.f28736j.hashCode() + ((hashCode2 + (c5Var == null ? 0 : c5Var.hashCode())) * 31)) * 31)) * 31, this.l, 31);
        String str2 = this.m;
        int hashCode3 = (this.f28738n.hashCode() + ((i + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Integer num = this.f28739o;
        return this.f28740p.hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("NotificationItemView(title=", this.f28728a, ", titleHTML=", this.f28729b, ", itemCount=");
        m0.w(o5, this.f28730c, ", isUnread=", this.f28731d, ", isSaved=");
        m0.A(o5, this.f28732e, ", isDone=", this.f28733f, ", lastUpdatedAt=");
        o5.append(this.f28734g);
        o5.append(", owner=");
        o5.append(this.f28735h);
        o5.append(", summary=");
        o5.append(this.i);
        o5.append(", subject=");
        o5.append(this.f28736j);
        o5.append(", reason=");
        o5.append(this.f28737k);
        o5.append(", id=");
        o5.append(this.l);
        o5.append(", url=");
        o5.append(this.m);
        o5.append(", itemCountColor=");
        o5.append(this.f28738n);
        o5.append(", number=");
        o5.append(this.f28739o);
        o5.append(", subscriptionInformation=");
        o5.append(this.f28740p);
        o5.append(")");
        return o5.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(z2 z2Var, a0 a0Var, boolean z10) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r0, a0Var);
        String str;
        lg.b bVar;
        String title = z2Var.getTitle();
        String d10 = z2Var.d();
        int b10 = z2Var.b();
        boolean g7 = z2Var.g();
        boolean f6 = z2Var.f();
        boolean isDone = z2Var.isDone();
        ZonedDateTime c10 = z2Var.c();
        i3 a10 = z2Var.a();
        c5 k10 = z2Var.k();
        q4 h10 = z2Var.h();
        NotificationReasonState i = z2Var.i();
        String id2 = z2Var.getId();
        Integer num = null;
        if (z10) {
            str = z2Var.getUrl();
        } else {
            n4 h11 = z2Var.h();
            if (h11 instanceof n4) {
                str = h11.v;
            } else if (h11 instanceof p4) {
                str = ((p4) h11).u;
            } else if (h11 instanceof y4) {
                str = ((y4) h11).u;
            } else if (h11 instanceof m4) {
                str = ((m4) h11).u;
            } else if (h11 instanceof s4) {
                str = ((s4) h11).v;
            } else if (h11 instanceof v4) {
                str = ((v4) h11).u;
            } else if (h11 instanceof w4) {
                str = ((w4) h11).u;
            } else if (h11 instanceof t4) {
                str = ((t4) h11).u;
            } else if (h11 instanceof u4) {
                str = ((u4) h11).u;
            } else if (h11 instanceof x4) {
                str = ((x4) h11).u;
            } else if (h11 instanceof a5) {
                str = ((a5) h11).u;
            } else if (h11 instanceof o4) {
                str = ((o4) h11).u;
            } else {
                if (!(h11 instanceof q4) && !(h11 instanceof r4) && !(h11 instanceof z4)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
        }
        o4 h12 = z2Var.h();
        if (h12 instanceof o4) {
            if (h12.v) {
                bVar = lg.b.s;
            } else {
                bVar = lg.b.r;
            }
        } else {
            bVar = lg.b.r;
        }
        if (h10 instanceof q4) {
            num = Integer.valueOf(h10.v);
        } else if (h10 instanceof r4) {
            num = Integer.valueOf(((r4) h10).w);
        } else if (h10 instanceof o4) {
            num = Integer.valueOf(((o4) h10).w);
        }
    }
}
