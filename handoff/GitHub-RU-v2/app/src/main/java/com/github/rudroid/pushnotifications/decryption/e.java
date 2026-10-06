package com.github.rudroid.pushnotifications.decryption;

import android.util.Base64;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public class e {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f18556a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f18557b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f18558c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f18559d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f18560e;

    public static final class a {
        public static e a(String str) {
            try {
                byte[] decode = Base64.decode(str, 0);
                if (decode.length < 65) {
                    return null;
                }
                if (decode.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                byte b10 = decode[0];
                List E = x61.l.E(decode);
                byte[] A0 = x61.m.A0(x61.m.x0(E, 16));
                List P = x61.m.P(16, E);
                return new e(str, A0, x61.m.A0(x61.m.Q(32, P)), x61.m.A0(x61.m.y0(32, P)), x61.m.A0(x61.l.F(decode)));
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public e(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f18556a = str;
        this.f18557b = bArr;
        this.f18558c = bArr2;
        this.f18559d = bArr3;
        this.f18560e = bArr4;
    }
}
