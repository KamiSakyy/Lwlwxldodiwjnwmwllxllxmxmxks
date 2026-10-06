package z11;

import android.os.Parcel;
import android.os.RemoteException;
import c21.j0;
import c21.uShadow;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class kShadow extends c41.d implements j0 {
    public int g;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        u.b(bArr.length == 25);
        this.g = Arrays.hashCode(bArr);
    }

    public static byte[] N(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // c41.d
    public final boolean L(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            j21.a d = d();
            parcel2.writeNoException();
            o21.g.b(parcel2, d);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.g);
        return true;
    }

    public abstract byte[] M();

    @Override // c21.j0
    public final int a() {
        return this.g;
    }

    @Override // c21.j0
    public final j21.a d() {
        return new j21.b(M());
    }

    public final boolean equals(Object obj) {
        j21.a d;
        if (!(obj instanceof j0)) {
            return false;
        }
        try {
            j0 j0Var = (j0) obj;
            if (j0Var.a() == this.g && (d = j0Var.d()) != null) {
                return Arrays.equals(M(), (byte[]) j21.b.N(d));
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.g;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i {
        public i() {
        }
    }
}
