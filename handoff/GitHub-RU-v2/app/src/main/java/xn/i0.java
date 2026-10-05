package xn;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        g gVar;
        m mVar;
        k kVar;
        boolean z4;
        switch (this.a) {
            case 0:
                k71.k.g(parcel, "parcel");
                return new j0(parcel.readInt(), parcel.readString(), parcel.readString(), n0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), m0.CREATOR.createFromParcel(parcel), o0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(h4.CREATOR.createFromParcel(parcel));
                }
                return new k0(readString, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case 2:
                k71.k.g(parcel, "parcel");
                return new m0(parcel.readString(), parcel.readString());
            case 3:
                k71.k.g(parcel, "parcel");
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                v vVar = (v) parcel.readParcelable(v0.class.getClassLoader());
                boolean z5 = parcel.readInt() != 0 ? true : z;
                j valueOf = j.valueOf(parcel.readString());
                h createFromParcel = h.CREATOR.createFromParcel(parcel);
                m createFromParcel2 = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
                k createFromParcel3 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
                g createFromParcel4 = parcel.readInt() != 0 ? g.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    z3 = true;
                    gVar = createFromParcel4;
                    mVar = createFromParcel2;
                    kVar = createFromParcel3;
                    z4 = true;
                } else {
                    z3 = true;
                    gVar = createFromParcel4;
                    mVar = createFromParcel2;
                    kVar = createFromParcel3;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new v0(readString3, readString4, gVar, createFromParcel, valueOf, kVar, mVar, vVar, z2, z5, z4, z3);
            case 4:
                k71.k.g(parcel, "parcel");
                return new h4(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                k71.k.g(parcel, "parcel");
                return new xz0.h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                int b0 = k41.b.b0(parcel);
                PendingIntent pendingIntent = null;
                String str = null;
                Integer num = null;
                int i2 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < b0) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        i2 = k41.b.F(parcel, readInt2);
                    } else if (c == 2) {
                        i3 = k41.b.F(parcel, readInt2);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) k41.b.n(parcel, readInt2, PendingIntent.CREATOR);
                    } else if (c == 4) {
                        str = k41.b.o(parcel, readInt2);
                    } else if (c != 5) {
                        k41.b.N(parcel, readInt2);
                    } else {
                        int H = k41.b.H(parcel, readInt2);
                        if (H == 0) {
                            num = null;
                        } else {
                            k41.b.h0(parcel, H, 4);
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                k41.b.s(parcel, b0);
                return new z11.b(i2, i3, pendingIntent, str, num);
            case 7:
                int b02 = k41.b.b0(parcel);
                int i4 = 0;
                boolean z6 = false;
                long j = -1;
                String str2 = null;
                while (parcel.dataPosition() < b02) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        str2 = k41.b.o(parcel, readInt3);
                    } else if (c2 == 2) {
                        i4 = k41.b.F(parcel, readInt3);
                    } else if (c2 == 3) {
                        j = k41.b.G(parcel, readInt3);
                    } else if (c2 != 4) {
                        k41.b.N(parcel, readInt3);
                    } else {
                        z6 = k41.b.D(parcel, readInt3);
                    }
                }
                k41.b.s(parcel, b02);
                return new z11.d(str2, i4, j, z6);
            default:
                int b03 = k41.b.b0(parcel);
                long j2 = -1;
                boolean z7 = false;
                int i5 = 0;
                int i6 = 0;
                String str3 = null;
                while (parcel.dataPosition() < b03) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        z7 = k41.b.D(parcel, readInt4);
                    } else if (c3 == 2) {
                        str3 = k41.b.o(parcel, readInt4);
                    } else if (c3 == 3) {
                        i5 = k41.b.F(parcel, readInt4);
                    } else if (c3 == 4) {
                        i6 = k41.b.F(parcel, readInt4);
                    } else if (c3 != 5) {
                        k41.b.N(parcel, readInt4);
                    } else {
                        j2 = k41.b.G(parcel, readInt4);
                    }
                }
                k41.b.s(parcel, b03);
                return new z11.p(z7, str3, i5, i6, j2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j0[i];
            case 1:
                return new k0[i];
            case 2:
                return new m0[i];
            case 3:
                return new v0[i];
            case 4:
                return new h4[i];
            case 5:
                return new xz0.h[i];
            case 6:
                return new z11.b[i];
            case 7:
                return new z11.d[i];
            default:
                return new z11.p[i];
        }
    }
}
