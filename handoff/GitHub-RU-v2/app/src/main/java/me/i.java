package me;

import a0.s0;
import com.github.rudroid.utilities.s2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class i {

    public static final class a extends i {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ClickableSpan(onClick=null)";
        }
    }

    public static final class b extends i {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Integer.hashCode(0) * 31);
        }

        public final String toString() {
            return "ColorSpan(color=0, lastInstance=false)";
        }
    }

    public static final class c extends i {
        public final boolean equals(Object obj) {
            Object obj2 = 2131101002;
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && obj2.equals(obj2);
        }

        public final int hashCode() {
            Integer num = 2131101002;
            return num.hashCode() + (Integer.hashCode(2131231352) * 31);
        }

        public final String toString() {
            return "ImageSpan(drawableResId=2131231352, tintResId=" + ((Object) 2131101002) + ")";
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        public final int f29233a;

        public d(int i) {
            this.f29233a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f29233a == ((d) obj).f29233a;
        }

        public final int hashCode() {
            return Integer.hashCode(2132017459) + (Integer.hashCode(this.f29233a) * 31);
        }

        public final String toString() {
            return s0.i("LabelSpan(color=", this.f29233a, ", appearanceRes=2132017459)");
        }
    }

    public static final class f extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final f f29236a = new f();
    }

    public static final class g extends i {

        /* renamed from: a, reason: collision with root package name */
        public final lg.b f29237a;

        public g(lg.b bVar) {
            this.f29237a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f29237a == ((g) obj).f29237a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.f29237a.hashCode() * 31);
        }

        public final String toString() {
            return "TransparentLabelSpan(color=" + this.f29237a + ", lastInstance=false)";
        }
    }

    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        public final s2.a f29234a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f29235b;

        public e(s2.a aVar) {
            this.f29234a = aVar;
            this.f29235b = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f29234a == eVar.f29234a && this.f29235b == eVar.f29235b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f29235b) + (this.f29234a.hashCode() * 31);
        }

        public final String toString() {
            return "TextStyleSpan(textStyle=" + this.f29234a + ", lastInstance=" + this.f29235b + ")";
        }

        public e(s2.a aVar, boolean z10) {
            this.f29234a = aVar;
            this.f29235b = z10;
        }
    }
}
