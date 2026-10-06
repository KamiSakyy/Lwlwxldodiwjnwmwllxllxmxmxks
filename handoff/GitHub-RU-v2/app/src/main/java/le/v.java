package le;

import a0.s0;
import android.graphics.Color;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.rudroid.utilities.j2;
import com.github.service.models.response.Avatar;
import jo.f4Shadow;
import v8.l0;
import yz0.t1;
import yz0.u1;
import yz0.v1;

/* loaded from: /home/user/work/p/classes.dex */
public interface v {
    public static final b Companion = b.f28749a;

    public static final class a implements v {

        /* renamed from: r, reason: collision with root package name */
        public t1 f28748r;

        public a(t1 t1Var) {
            k71.k.g(t1Var, "codeSearchResult");
            this.f28748r = t1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && k71.k.b(this.f28748r, ((a) obj).f28748r);
        }

        @Override // le.v
        public final int h() {
            return 11;
        }

        public final int hashCode() {
            return this.f28748r.hashCode() + (Integer.hashCode(11) * 31);
        }

        public final String toString() {
            return "Code(itemType=11, codeSearchResult=" + this.f28748r + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f28749a = new b();
    }

    public static final class c implements v, x {

        /* renamed from: r, reason: collision with root package name */
        public int f28750r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f28751s;

        /* renamed from: t, reason: collision with root package name */
        public u f28752t;

        public c(int i, Integer num, u uVar) {
            this.f28750r = i;
            this.f28751s = num;
            this.f28752t = uVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f28750r == cVar.f28750r && k71.k.b(this.f28751s, cVar.f28751s) && this.f28752t.equals(cVar.f28752t);
        }

        @Override // le.v
        public final int h() {
            return 7;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f28750r) * 31;
            Integer num = this.f28751s;
            return Integer.hashCode(7) + ((this.f28752t.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Footer(titleTextId=" + this.f28750r + ", resultCount=" + this.f28751s + ", searchFooterType=" + this.f28752t + ", itemType=7)";
        }
    }

    public static final class e implements v {

        /* renamed from: r, reason: collision with root package name */
        public String f28760r;

        public e(String str) {
            k71.k.g(str, "query");
            this.f28760r = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && k71.k.b(this.f28760r, ((e) obj).f28760r);
        }

        @Override // le.v
        public final int h() {
            return 9;
        }

        public final int hashCode() {
            return Integer.hashCode(9) + (this.f28760r.hashCode() * 31);
        }

        public final String toString() {
            return f1.e.z("RecentSearch(query=", this.f28760r, ", itemType=9)");
        }
    }

    public static final class f implements v, com.github.rudroid.repositories.k {
        public String A;
        public int B;

        /* renamed from: r, reason: collision with root package name */
        public String f28761r;

        /* renamed from: s, reason: collision with root package name */
        public String f28762s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f28763t;

        /* renamed from: u, reason: collision with root package name */
        public com.github.service.models.response.a f28764u;

        /* renamed from: v, reason: collision with root package name */
        public String f28765v;

        /* renamed from: w, reason: collision with root package name */
        public String f28766w;

        /* renamed from: x, reason: collision with root package name */
        public int f28767x;

        /* renamed from: y, reason: collision with root package name */
        public int f28768y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f28769z;

        public f(u1 u1Var) {
            k71.k.g(u1Var, "repository");
            String id2 = u1Var.getId();
            String name = u1Var.getName();
            boolean d10 = u1Var.d();
            com.github.service.models.response.a a10 = u1Var.a();
            String g7 = u1Var.g();
            String b10 = u1Var.b();
            String c10 = u1Var.c();
            int parseColor = c10 != null ? Color.parseColor(c10) : -16777216;
            int e5 = u1Var.e();
            boolean f6 = u1Var.f();
            String parent = u1Var.getParent();
            k71.k.g(id2, "id");
            k71.k.g(name, "name");
            k71.k.g(a10, "owner");
            this.f28761r = id2;
            this.f28762s = name;
            this.f28763t = d10;
            this.f28764u = a10;
            this.f28765v = g7;
            this.f28766w = b10;
            this.f28767x = parseColor;
            this.f28768y = e5;
            this.f28769z = f6;
            this.A = parent;
            this.B = 3;
        }

        @Override // com.github.rudroid.repositories.k
        public final com.github.service.models.response.a a() {
            return this.f28764u;
        }

        @Override // com.github.rudroid.repositories.k
        public final String b() {
            return this.f28766w;
        }

        @Override // com.github.rudroid.repositories.k
        public final int c() {
            return this.f28767x;
        }

        @Override // com.github.rudroid.repositories.k
        public final boolean d() {
            return this.f28763t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return k71.k.b(this.f28761r, fVar.f28761r) && k71.k.b(this.f28762s, fVar.f28762s) && this.f28763t == fVar.f28763t && k71.k.b(this.f28764u, fVar.f28764u) && k71.k.b(this.f28765v, fVar.f28765v) && k71.k.b(this.f28766w, fVar.f28766w) && this.f28767x == fVar.f28767x && this.f28768y == fVar.f28768y && this.f28769z == fVar.f28769z && k71.k.b(this.A, fVar.A) && this.B == fVar.B;
        }

        @Override // com.github.rudroid.repositories.k
        public final boolean f() {
            return this.f28769z;
        }

        @Override // com.github.rudroid.repositories.k
        public final String g() {
            return this.f28765v;
        }

        @Override // com.github.rudroid.repositories.k
        public final String getId() {
            return this.f28761r;
        }

        @Override // com.github.rudroid.repositories.k
        public final String getName() {
            return this.f28762s;
        }

        @Override // com.github.rudroid.repositories.k
        public final String getParent() {
            return this.A;
        }

        @Override // le.v
        public final int h() {
            return this.B;
        }

        public final int hashCode() {
            int b10 = f4.b(this.f28764u, x.i.e(h1.i(this.f28761r.hashCode() * 31, this.f28762s, 31), 31, this.f28763t), 31);
            String str = this.f28765v;
            int hashCode = (b10 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28766w;
            int e5 = x.i.e(s0.b(this.f28768y, s0.b(this.f28767x, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f28769z);
            String str3 = this.A;
            return Integer.hashCode(this.B) + ((e5 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @Override // com.github.rudroid.repositories.k
        public final int i() {
            return this.f28768y;
        }

        public final String toString() {
            StringBuilder o5 = s0.o("Repository(id=", this.f28761r, ", name=", this.f28762s, ", isPrivate=");
            o5.append(this.f28763t);
            o5.append(", owner=");
            o5.append(this.f28764u);
            o5.append(", descriptionHtml=");
            f1.e.x(o5, this.f28765v, ", languageName=", this.f28766w, ", languageColor=");
            s0.z(o5, this.f28767x, ", stargazersCount=", this.f28768y, ", isFork=");
            m0.z(o5, this.f28769z, ", parent=", this.A, ", itemType=");
            return s0.l(o5, this.B, ")");
        }
    }

    public static abstract class g implements v {

        public static final class a extends g {

            /* renamed from: r, reason: collision with root package name */
            public String f28770r;

            public a(String str) {
                k71.k.g(str, "query");
                this.f28770r = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954328;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28770r;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && k71.k.b(this.f28770r, ((a) obj).f28770r);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954328, this.f28770r.hashCode() * 31, 31);
            }

            public final String toString() {
                return f1.e.z("Code(query=", this.f28770r, ", formatStringId=2131954328, itemType=8)");
            }
        }

        public static final class b extends g {

            /* renamed from: r, reason: collision with root package name */
            public String f28771r;

            public b(String str) {
                k71.k.g(str, "query");
                this.f28771r = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954329;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28771r;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && k71.k.b(this.f28771r, ((b) obj).f28771r);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954329, this.f28771r.hashCode() * 31, 31);
            }

            public final String toString() {
                return f1.e.z("Issue(query=", this.f28771r, ", formatStringId=2131954329, itemType=8)");
            }
        }

        public static final class c extends g {

            /* renamed from: r, reason: collision with root package name */
            public j2.a f28772r;

            /* renamed from: s, reason: collision with root package name */
            public String f28773s;

            public c(j2.a aVar, String str) {
                k71.k.g(str, "query");
                this.f28772r = aVar;
                this.f28773s = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954335;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28773s;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f28772r.equals(cVar.f28772r) && k71.k.b(this.f28773s, cVar.f28773s);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954335, h1.i(this.f28772r.hashCode() * 31, this.f28773s, 31), 31);
            }

            public final String toString() {
                return "JumpTo(type=" + this.f28772r + ", query=" + this.f28773s + ", formatStringId=2131954335, itemType=8)";
            }
        }

        public static final class d extends g {

            /* renamed from: r, reason: collision with root package name */
            public String f28774r;

            public d(String str) {
                k71.k.g(str, "query");
                this.f28774r = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954330;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28774r;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && k71.k.b(this.f28774r, ((d) obj).f28774r);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954330, this.f28774r.hashCode() * 31, 31);
            }

            public final String toString() {
                return f1.e.z("Org(query=", this.f28774r, ", formatStringId=2131954330, itemType=8)");
            }
        }

        public static final class e extends g {

            /* renamed from: r, reason: collision with root package name */
            public String f28775r;

            public e(String str) {
                k71.k.g(str, "query");
                this.f28775r = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954331;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28775r;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && k71.k.b(this.f28775r, ((e) obj).f28775r);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954331, this.f28775r.hashCode() * 31, 31);
            }

            public final String toString() {
                return f1.e.z("People(query=", this.f28775r, ", formatStringId=2131954331, itemType=8)");
            }
        }

        public static final class f extends g {

            /* renamed from: r, reason: collision with root package name */
            public String f28776r;

            public f(String str) {
                k71.k.g(str, "query");
                this.f28776r = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954332;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28776r;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && k71.k.b(this.f28776r, ((f) obj).f28776r);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954332, this.f28776r.hashCode() * 31, 31);
            }

            public final String toString() {
                return f1.e.z("Pull(query=", this.f28776r, ", formatStringId=2131954332, itemType=8)");
            }
        }

        /* renamed from: le.v$g$g, reason: collision with other inner class name */
        public static final class C0083g extends g {

            /* renamed from: r, reason: collision with root package name */
            public String f28777r;

            public C0083g(String str) {
                k71.k.g(str, "query");
                this.f28777r = str;
            }

            @Override // le.v.g
            public final int a() {
                return 2131954333;
            }

            @Override // le.v.g
            public final String b() {
                return this.f28777r;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0083g) && k71.k.b(this.f28777r, ((C0083g) obj).f28777r);
            }

            @Override // le.v
            public final int h() {
                return 8;
            }

            public final int hashCode() {
                return Integer.hashCode(8) + s0.b(2131954333, this.f28777r.hashCode() * 31, 31);
            }

            public final String toString() {
                return f1.e.z("Repo(query=", this.f28777r, ", formatStringId=2131954333, itemType=8)");
            }
        }

        public abstract int a();

        public abstract String b();
    }

    public static final class h implements v {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // le.v
        public final int h() {
            return 10;
        }

        public final int hashCode() {
            return Integer.hashCode(10);
        }

        public final String toString() {
            return "SectionDivider(itemType=10)";
        }
    }

    public static final class i implements v, oe.g {

        /* renamed from: r, reason: collision with root package name */
        public String f28778r;

        /* renamed from: s, reason: collision with root package name */
        public String f28779s;

        /* renamed from: t, reason: collision with root package name */
        public String f28780t;

        /* renamed from: u, reason: collision with root package name */
        public String f28781u;

        /* renamed from: v, reason: collision with root package name */
        public Avatar f28782v;

        /* renamed from: w, reason: collision with root package name */
        public int f28783w;

        public i(v1 v1Var) {
            k71.k.g(v1Var, "user");
            String id2 = v1Var.getId();
            String name = v1Var.getName();
            String d10 = v1Var.d();
            String f6 = v1Var.f();
            Avatar e5 = v1Var.e();
            k71.k.g(id2, "id");
            k71.k.g(d10, "login");
            k71.k.g(f6, "bioHtml");
            k71.k.g(e5, "avatar");
            this.f28778r = id2;
            this.f28779s = name;
            this.f28780t = d10;
            this.f28781u = f6;
            this.f28782v = e5;
            this.f28783w = 1;
        }

        @Override // oe.g
        public final String d() {
            return this.f28780t;
        }

        @Override // oe.g
        public final Avatar e() {
            return this.f28782v;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return k71.k.b(this.f28778r, iVar.f28778r) && k71.k.b(this.f28779s, iVar.f28779s) && k71.k.b(this.f28780t, iVar.f28780t) && k71.k.b(this.f28781u, iVar.f28781u) && k71.k.b(this.f28782v, iVar.f28782v) && this.f28783w == iVar.f28783w;
        }

        @Override // oe.g
        public final String f() {
            return this.f28781u;
        }

        @Override // oe.g
        public final String getName() {
            return this.f28779s;
        }

        @Override // le.v
        public final int h() {
            return this.f28783w;
        }

        public final int hashCode() {
            int hashCode = this.f28778r.hashCode() * 31;
            String str = this.f28779s;
            return Integer.hashCode(this.f28783w) + h1.j(this.f28782v, h1.i(h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.f28780t, 31), this.f28781u, 31), 31);
        }

        public final String toString() {
            StringBuilder o5 = s0.o("User(id=", this.f28778r, ", name=", this.f28779s, ", login=");
            f1.e.x(o5, this.f28780t, ", bioHtml=", this.f28781u, ", avatar=");
            o5.append(this.f28782v);
            o5.append(", itemType=");
            o5.append(this.f28783w);
            o5.append(")");
            return o5.toString();
        }
    }

    int h();

    public static final class d implements v, le.g {

        /* renamed from: r, reason: collision with root package name */
        public int f28753r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f28754s;

        /* renamed from: t, reason: collision with root package name */
        public a f28755t;

        /* renamed from: u, reason: collision with root package name */
        public int f28756u;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {

            /* renamed from: r, reason: collision with root package name */
            public static final a f28757r;

            /* renamed from: s, reason: collision with root package name */
            public static final a f28758s;

            /* renamed from: t, reason: collision with root package name */
            public static final /* synthetic */ a[] f28759t;

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f28759t.clone();
            }
        }

        public d(int i, Integer num, a aVar) {
            this.f28753r = i;
            this.f28754s = num;
            this.f28755t = aVar;
            this.f28756u = 6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f28753r == dVar.f28753r && k71.k.b(this.f28754s, dVar.f28754s) && this.f28755t == dVar.f28755t;
        }

        @Override // le.v
        public final int h() {
            return this.f28756u;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f28753r) * 31;
            Integer num = this.f28754s;
            return this.f28755t.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Header(titleTextId=" + this.f28753r + ", buttonTextId=" + this.f28754s + ", type=" + this.f28755t + ")";
        }

        public /* synthetic */ d(int i) {
            this(i, null, a.f28758s);
        }
    }
}
