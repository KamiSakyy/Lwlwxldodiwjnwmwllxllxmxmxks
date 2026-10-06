package com.github.rudroid.projects.ui.quickaction;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public interface h0 {

    public static final class a implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18347a = new a();
    }

    public static final class b implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18348a = new b();
    }

    public static final class c implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18349a = new c();
    }

    public static final class d implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18350a;

        public d(boolean z10) {
            this.f18350a = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f18350a == ((d) obj).f18350a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f18350a);
        }

        public final String toString() {
            return m0.i("OnCloseIssueClick(isExpanded=", ")", this.f18350a);
        }
    }

    public static final class e implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18351a = new e();
    }

    public static final class f implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f18352a = new f();
    }

    public static final class g implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f18353a = new g();
    }

    public static final class h implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f18354a = new h();
    }

    public static final class i implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f18355a = new i();
    }

    public static final class j implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f18356a = new j();
    }

    public static final class k implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18357a;

        public k(boolean z10) {
            this.f18357a = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f18357a == ((k) obj).f18357a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f18357a);
        }

        public final String toString() {
            return m0.i("OnOtherProjectsClick(isExpanded=", ")", this.f18357a);
        }
    }

    public static final class l implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f18358a = new l();
    }

    public static final class m implements h0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f18359a = new m();
    }

    public interface n extends h0 {

        public static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public final int f18360a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18361b;

            public a(String str, int i) {
                this.f18360a = i;
                this.f18361b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f18360a == aVar.f18360a && k71.k.b(this.f18361b, aVar.f18361b);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.f18360a) * 31;
                String str = this.f18361b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "OnOtherProjectClick(projectNumber=" + this.f18360a + ", projectTitle=" + this.f18361b + ")";
            }
        }

        public static final class b implements n {

            /* renamed from: a, reason: collision with root package name */
            public final String f18362a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18363b;

            /* renamed from: c, reason: collision with root package name */
            public final int f18364c;

            public b(String str, int i, String str2) {
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                this.f18362a = str;
                this.f18363b = str2;
                this.f18364c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k71.k.b(this.f18362a, bVar.f18362a) && k71.k.b(this.f18363b, bVar.f18363b) && this.f18364c == bVar.f18364c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f18364c) + h1.i(this.f18362a.hashCode() * 31, this.f18363b, 31);
            }

            public final String toString() {
                return s0.l(s0.o("OnParentIssueClick(ownerLogin=", this.f18362a, ", repositoryName=", this.f18363b, ", issueOrPullRequestNumber="), this.f18364c, ")");
            }
        }

        public static final class c implements n {

            /* renamed from: a, reason: collision with root package name */
            public final String f18365a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18366b;

            public c(String str, String str2) {
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                this.f18365a = str;
                this.f18366b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return k71.k.b(this.f18365a, cVar.f18365a) && k71.k.b(this.f18366b, cVar.f18366b);
            }

            public final int hashCode() {
                return this.f18366b.hashCode() + (this.f18365a.hashCode() * 31);
            }

            public final String toString() {
                return x.i.g("OnRepositoryNameClick(ownerLogin=", this.f18365a, ", repositoryName=", this.f18366b, ")");
            }
        }

        public static final class d implements n {

            /* renamed from: a, reason: collision with root package name */
            public final String f18367a;

            public d(String str) {
                k71.k.g(str, "userOrOrgLogin");
                this.f18367a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && k71.k.b(this.f18367a, ((d) obj).f18367a);
            }

            public final int hashCode() {
                return this.f18367a.hashCode();
            }

            public final String toString() {
                return f1.e.z("OnUserOrOrgClick(userOrOrgLogin=", this.f18367a, ")");
            }
        }

        public static final class e implements n {

            /* renamed from: a, reason: collision with root package name */
            public final String f18368a;

            /* renamed from: b, reason: collision with root package name */
            public final String f18369b;

            /* renamed from: c, reason: collision with root package name */
            public final int f18370c;

            /* renamed from: d, reason: collision with root package name */
            public final String f18371d;

            /* renamed from: e, reason: collision with root package name */
            public final String f18372e;

            /* renamed from: f, reason: collision with root package name */
            public final String f18373f;

            /* renamed from: g, reason: collision with root package name */
            public final String f18374g;

            /* renamed from: h, reason: collision with root package name */
            public final List f18375h;

            public e(String str, String str2, int i, String str3, String str4, String str5, String str6, List list) {
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "issueOrPullRequestTitle");
                k71.k.g(str4, "boardItemId");
                k71.k.g(str5, "boardItemFullDatabaseId");
                k71.k.g(list, "viewGroupedByFields");
                this.f18368a = str;
                this.f18369b = str2;
                this.f18370c = i;
                this.f18371d = str3;
                this.f18372e = str4;
                this.f18373f = str5;
                this.f18374g = str6;
                this.f18375h = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return k71.k.b(this.f18368a, eVar.f18368a) && k71.k.b(this.f18369b, eVar.f18369b) && this.f18370c == eVar.f18370c && k71.k.b(this.f18371d, eVar.f18371d) && k71.k.b(this.f18372e, eVar.f18372e) && k71.k.b(this.f18373f, eVar.f18373f) && k71.k.b(this.f18374g, eVar.f18374g) && k71.k.b(this.f18375h, eVar.f18375h);
            }

            public final int hashCode() {
                int i = h1.i(h1.i(h1.i(s0.b(this.f18370c, h1.i(this.f18368a.hashCode() * 31, this.f18369b, 31), 31), this.f18371d, 31), this.f18372e, 31), this.f18373f, 31);
                String str = this.f18374g;
                return this.f18375h.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder o5 = s0.o("OnViewItemClick(ownerLogin=", this.f18368a, ", repositoryName=", this.f18369b, ", issueOrPullRequestNumber=");
                x.i.r(this.f18370c, ", issueOrPullRequestTitle=", this.f18371d, ", boardItemId=", o5);
                f1.e.x(o5, this.f18372e, ", boardItemFullDatabaseId=", this.f18373f, ", selectedViewId=");
                o5.append(this.f18374g);
                o5.append(", viewGroupedByFields=");
                o5.append(this.f18375h);
                o5.append(")");
                return o5.toString();
            }
        }
    }
}
