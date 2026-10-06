package androidx.constraintlayout.core.parser;

import c4.c;

/* loaded from: /home/user/work/p/classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: r, reason: collision with root package name */
    public final String f2097r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2098s;

    public CLParsingException(String str, c cVar) {
        super(str);
        this.f2097r = str;
        if (cVar != null) {
            this.f2098s = cVar.g();
        } else {
            this.f2098s = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CLParsingException (");
        sb2.append(hashCode());
        sb2.append(") : ");
        sb2.append(this.f2097r + " (" + this.f2098s + " at line 0)");
        return sb2.toString();
    }
}
