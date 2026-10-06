package a31;

import a21.g;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new g(2);
    public String A;
    public Locale E;
    public CharSequence F;
    public CharSequence G;
    public int H;
    public int I;
    public Integer J;
    public Integer L;
    public Integer M;
    public Integer N;
    public Integer O;
    public Integer P;
    public Integer Q;
    public Integer R;
    public Integer S;
    public Integer T;
    public Boolean U;
    public Integer V;
    public int r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public int z = 255;
    public int B = -2;
    public int C = -2;
    public int D = -2;
    public Boolean K = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.r);
        parcel.writeSerializable(this.s);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.u);
        parcel.writeSerializable(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        CharSequence charSequence = this.F;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.G;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.H);
        parcel.writeSerializable(this.J);
        parcel.writeSerializable(this.L);
        parcel.writeSerializable(this.M);
        parcel.writeSerializable(this.N);
        parcel.writeSerializable(this.O);
        parcel.writeSerializable(this.P);
        parcel.writeSerializable(this.Q);
        parcel.writeSerializable(this.T);
        parcel.writeSerializable(this.R);
        parcel.writeSerializable(this.S);
        parcel.writeSerializable(this.K);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.U);
        parcel.writeSerializable(this.V);
    }
}
