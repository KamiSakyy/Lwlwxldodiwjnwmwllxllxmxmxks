package ub;

import java.util.Set;
import k71.k;
import v8.l0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: ub.a$a, reason: collision with other inner class name */
    public static final class C0092a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f32279a;

        public C0092a(Set set) {
            k.g(set, "customSubscriptions");
            this.f32279a = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0092a) && k.b(this.f32279a, ((C0092a) obj).f32279a);
        }

        public final int hashCode() {
            return this.f32279a.hashCode();
        }

        public final String toString() {
            return "Custom(customSubscriptions=" + this.f32279a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: r, reason: collision with root package name */
        public static final b f32280r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f32281s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f32282t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f32283u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f32284v;

        /* renamed from: w, reason: collision with root package name */
        public static final /* synthetic */ b[] f32285w;

        static {
            b bVar = new b("Issue", 0);
            f32280r = bVar;
            b bVar2 = new b("PullRequest", 1);
            f32281s = bVar2;
            b bVar3 = new b("Release", 2);
            f32282t = bVar3;
            b bVar4 = new b("Discussion", 3);
            f32283u = bVar4;
            b bVar5 = new b("SecurityAlert", 4);
            f32284v = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f32285w = bVarArr;
            l0.t(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f32285w.clone();
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32286a = new c();
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32287a = new d();
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f32288a = new e();
    }
}
