package le;

import a0.s0;
import com.github.rudroid.utilities.n;
import yz0.m1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n implements zh.b {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b extends n implements n.c {

        /* renamed from: r, reason: collision with root package name */
        public final String f28703r;

        /* renamed from: s, reason: collision with root package name */
        public final int f28704s;

        /* renamed from: t, reason: collision with root package name */
        public final int f28705t;

        /* renamed from: u, reason: collision with root package name */
        public final Integer f28706u;

        /* renamed from: v, reason: collision with root package name */
        public final String f28707v;

        public b(m1 m1Var, Integer num) {
            k71.k.g(m1Var, "fileLine");
            String str = m1Var.a;
            int i = m1Var.b;
            int i10 = m1Var.c;
            this.f28703r = str;
            this.f28704s = i;
            this.f28705t = i10;
            this.f28706u = num;
            int hashCode = str.hashCode();
            StringBuilder m = x.i.m(i10, i, "line_", ":", ":");
            m.append(hashCode);
            this.f28707v = m.toString();
        }

        public final String E() {
            return this.f28707v;
        }

        public final int b() {
            return this.f28704s;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.f28703r, bVar.f28703r) && this.f28704s == bVar.f28704s && this.f28705t == bVar.f28705t && k71.k.b(this.f28706u, bVar.f28706u);
        }

        public final int getLineNumber() {
            return this.f28705t;
        }

        public final int h() {
            return 1;
        }

        public final int hashCode() {
            int b10 = s0.b(this.f28705t, s0.b(this.f28704s, this.f28703r.hashCode() * 31, 31), 31);
            Integer num = this.f28706u;
            return b10 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder n10 = s0.n(this.f28704s, "FileLineItem(contentHtml=", this.f28703r, ", contentLength=", ", lineNumber=");
            n10.append(this.f28705t);
            n10.append(", jumpToLineNumber=");
            n10.append(this.f28706u);
            n10.append(")");
            return n10.toString();
        }
    }
}
