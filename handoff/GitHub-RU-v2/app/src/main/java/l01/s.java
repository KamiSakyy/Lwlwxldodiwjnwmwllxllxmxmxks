package l01;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new c(12);
    public p0 r;
    public t0 s;

    public s(p0 p0Var, t0 t0Var) {
        k71.k.g(p0Var, "projectItem");
        k71.k.g(t0Var, "project");
        this.r = p0Var;
        this.s = t0Var;
    }

    public static s c(s sVar, p0 p0Var) {
        t0 t0Var = sVar.s;
        sVar.getClass();
        k71.k.g(t0Var, "project");
        return new s(p0Var, t0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.r, sVar.r) && k71.k.b(this.s, sVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "ItemWithProjectInfo(projectItem=" + this.r + ", project=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        this.r.writeToParcel(parcel, i);
        this.s.writeToParcel(parcel, i);
    }
}
