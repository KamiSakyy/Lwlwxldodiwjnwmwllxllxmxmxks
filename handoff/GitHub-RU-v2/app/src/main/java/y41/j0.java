package y41;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 extends m2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final u1 g;
    public final l2 h;
    public final k2 i;
    public final v1 j;
    public final List k;
    public final int l;

    public j0(String str, String str2, String str3, long j, Long l, boolean z, u1 u1Var, l2 l2Var, k2 k2Var, v1 v1Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = u1Var;
        this.h = l2Var;
        this.i = k2Var;
        this.j = v1Var;
        this.k = list;
        this.l = i;
    }

    @Override // y41.m2
    public final i0 a() {
        i0 i0Var = new i0();
        i0Var.a = this.a;
        i0Var.b = this.b;
        i0Var.c = this.c;
        i0Var.d = this.d;
        i0Var.e = this.e;
        i0Var.f = this.f;
        i0Var.g = this.g;
        i0Var.h = this.h;
        i0Var.i = this.i;
        i0Var.j = this.j;
        i0Var.k = this.k;
        i0Var.l = this.l;
        i0Var.m = (byte) 7;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        l2 l2Var;
        k2 k2Var;
        v1 v1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            j0 j0Var = (j0) ((m2) obj);
            List list2 = j0Var.k;
            v1 v1Var2 = j0Var.j;
            k2 k2Var2 = j0Var.i;
            l2 l2Var2 = j0Var.h;
            Long l2 = j0Var.e;
            String str2 = j0Var.c;
            if (this.a.equals(j0Var.a) && this.b.equals(j0Var.b) && ((str = this.c) != null ? str.equals(str2) : str2 == null) && this.d == j0Var.d && ((l = this.e) != null ? l.equals(l2) : l2 == null) && this.f == j0Var.f && this.g.equals(j0Var.g) && ((l2Var = this.h) != null ? l2Var.equals(l2Var2) : l2Var2 == null) && ((k2Var = this.i) != null ? k2Var.equals(k2Var2) : k2Var2 == null) && ((v1Var = this.j) != null ? v1Var.equals(v1Var2) : v1Var2 == null) && ((list = this.k) != null ? list.equals(list2) : list2 == null) && this.l == j0Var.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        l2 l2Var = this.h;
        int hashCode4 = (hashCode3 ^ (l2Var == null ? 0 : l2Var.hashCode())) * 1000003;
        k2 k2Var = this.i;
        int hashCode5 = (hashCode4 ^ (k2Var == null ? 0 : k2Var.hashCode())) * 1000003;
        v1 v1Var = this.j;
        int hashCode6 = (hashCode5 ^ (v1Var == null ? 0 : v1Var.hashCode())) * 1000003;
        List list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return a0.s0.l(sb, this.l, "}");
    }


}
