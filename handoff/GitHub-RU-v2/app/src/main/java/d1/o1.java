package d1;

import android.view.textclassifier.TextClassification;

/* loaded from: /home/user/work/p/classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21166a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21167b;

    /* renamed from: c, reason: collision with root package name */
    public final TextClassification f21168c;

    public o1(CharSequence charSequence, long j10, TextClassification textClassification) {
        this.f21166a = charSequence;
        this.f21167b = j10;
        this.f21168c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.f21166a, o1Var.f21166a) && g3.p0.b(this.f21167b, o1Var.f21167b) && k71.k.b(this.f21168c, o1Var.f21168c);
    }

    public final int hashCode() {
        int hashCode = this.f21166a.hashCode() * 31;
        int i = g3.p0.f24683c;
        return this.f21168c.hashCode() + x.i.c(hashCode, 31, this.f21167b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f21166a) + ", selection=" + ((Object) g3.p0.h(this.f21167b)) + ", textClassification=" + this.f21168c + ')';
    }
}
