package zh;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import t71.p;
import x.i;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c implements zh.b, f {
    public static final a Companion = new a();
    public static final int t = l.r(new Integer[]{0, 1}).size();
    public int r;
    public String s;

    public static final class a {
        public static c a(a aVar, String str, String str2, boolean z, String str3, int i) {
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            int i2 = (i & 16) != 0 ? 2131166020 : 2131165315;
            if ((i & 32) != 0) {
                str3 = null;
            }
            String str4 = str3;
            aVar.getClass();
            k.g(str, "id");
            k.g(str2, "bodyHtml");
            return p.T(str2) ? new b("empty_body:".concat(str), z2) : new C0033c("markdown_body:".concat(str), str2, null, z2, i2, str, str4, 4);
        }
    }

    public static final class b extends c implements me.b {
        public String u;
        public boolean v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z) {
            super(str, 1);
            k.g(str, "stableId");
            this.u = str;
            this.v = z;
        }

        @Override // zh.c
        public final String E() {
            return this.u;
        }

        @Override // zh.f
        public final String a() {
            return null;
        }

        public final boolean c() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.b(this.u, bVar.u) && this.v == bVar.v;
        }

        public final int hashCode() {
            return Integer.hashCode(2131166020) + s0.b(2131952994, i.e(this.u.hashCode() * 31, 961, this.v), 31);
        }

        public final String toString() {
            return h1.n("EmptyBodyListItem(stableId=", this.u, ", showAsHighlighted=", ", commentId=null, emptyText=2131952994, topPadding=2131166020)", this.v);
        }
    }

    /* renamed from: zh.c$c, reason: collision with other inner class name */
    public static final class C0033c extends c implements g {
        public String A;
        public int B;
        public String C;
        public String u;
        public String v;
        public String w;
        public boolean x;
        public int y;
        public String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0033c(String str, String str2, String str3, boolean z, int i, String str4, String str5, int i2) {
            super(str, 0);
            str3 = (i2 & 4) != 0 ? null : str3;
            z = (i2 & 8) != 0 ? false : z;
            i = (i2 & 16) != 0 ? 2131166020 : i;
            str4 = (i2 & 32) != 0 ? null : str4;
            str5 = (i2 & 64) != 0 ? null : str5;
            k.g(str, "stableId");
            k.g(str2, "html");
            this.u = str;
            this.v = str2;
            this.w = str3;
            this.x = z;
            this.y = i;
            this.z = str4;
            this.A = str5;
            this.B = str2.hashCode();
            this.C = str4 != null ? str4 : str;
        }

        @Override // zh.c
        public final String E() {
            return this.u;
        }

        @Override // zh.g
        public final String G() {
            return this.v;
        }

        @Override // zh.g
        public final int L() {
            return this.B;
        }

        @Override // zh.g
        public final String Q() {
            return this.w;
        }

        @Override // zh.f
        public final String a() {
            return this.z;
        }

        public final boolean c() {
            return this.x;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0033c)) {
                return false;
            }
            C0033c c0033c = (C0033c) obj;
            return k.b(this.u, c0033c.u) && k.b(this.v, c0033c.v) && k.b(this.w, c0033c.w) && this.x == c0033c.x && this.y == c0033c.y && k.b(this.z, c0033c.z) && k.b(this.A, c0033c.A);
        }

        @Override // zh.g
        public final String getId() {
            return this.C;
        }

        public final int hashCode() {
            int i = h1.i(this.u.hashCode() * 31, this.v, 31);
            String str = this.w;
            int b = s0.b(this.y, i.e((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.x), 31);
            String str2 = this.z;
            int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.A;
            return hashCode + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // zh.g
        public final int r() {
            return this.y;
        }

        public final String toString() {
            StringBuilder o = s0.o("WebViewBodyListItem(stableId=", this.u, ", html=", this.v, ", absoluteUrl=");
            m0.x(o, this.w, ", showAsHighlighted=", this.x, ", topPaddingResId=");
            i.r(this.y, ", commentId=", this.z, ", scrollToAnchor=", o);
            return h1.p(o, this.A, ")");
        }

        @Override // zh.g
        public final String z() {
            return this.A;
        }
    }

    public c(String str, int i) {
        this.r = i;
        this.s = str;
    }

    public String E() {
        return this.s;
    }

    @Override // zh.b
    public final int h() {
        return this.r;
    }
}
