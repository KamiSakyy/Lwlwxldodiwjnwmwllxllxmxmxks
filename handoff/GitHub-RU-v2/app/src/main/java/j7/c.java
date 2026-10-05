package j7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import com.github.rudroid.copilot.h1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final k50.c f27249a = new k50.c(7);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f27250b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f27251c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f27252d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f27253e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f27254f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27255g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f27256h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f27257j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (a aVar : aVarArr) {
            i11 += ((((aVar.f27247g * 2) + 7) & (-8)) / 8) + (aVar.f27245e * 2) + d(bArr, aVar.f27241a, aVar.f27242b).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f27246f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, f27254f)) {
            int length = aVarArr.length;
            while (i10 < length) {
                a aVar2 = aVarArr[i10];
                q(byteArrayOutputStream, aVar2, d(bArr, aVar2.f27241a, aVar2.f27242b));
                p(byteArrayOutputStream, aVar2);
                i10++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(bArr, aVar3.f27241a, aVar3.f27242b));
            }
            int length2 = aVarArr.length;
            while (i10 < length2) {
                p(byteArrayOutputStream, aVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f27256h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f27255g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return h1.p(f1.e.p(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read < 0) {
                throw new IllegalStateException(no.a.k("Not enough bytes to read: ", i10));
            }
            i11 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) m(byteArrayInputStream, 2);
            iArr[i12] = i11;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i13 += inflater.inflate(bArr, i13, i11 - i13);
                    i12 += read;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f27257j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                a[] k10 = k(byteArrayInputStream, bArr2, m, aVarArr);
                byteArrayInputStream.close();
                return k10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f27252d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h11 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            a[] j10 = j(byteArrayInputStream2, m10, aVarArr);
            byteArrayInputStream2.close();
            return j10;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i10, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i10 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, m), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            a aVar = aVarArr[i12];
            if (!aVar.f27242b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            aVar.f27245e = i13;
            aVar.f27248h = g(byteArrayInputStream, i13);
        }
        return aVarArr;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i10 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m = m(byteArrayInputStream, 4);
            int m10 = (int) m(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= aVarArr.length) {
                        break;
                    }
                    if (aVarArr[i12].f27242b.equals(substring)) {
                        aVar = aVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f27244d = m;
            int[] g7 = g(byteArrayInputStream, m10);
            if (Arrays.equals(bArr, f27256h)) {
                aVar.f27245e = m10;
                aVar.f27248h = g7;
            }
        }
        return aVarArr;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f27253e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m = (int) m(fileInputStream, 1);
        byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            a[] n10 = n(byteArrayInputStream, str, m);
            byteArrayInputStream.close();
            return n10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i10) {
        byte[] f6 = f(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += (f6[i11] & 255) << (i11 * 8);
        }
        return j10;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int m = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            aVarArr[i12] = new a(str, new String(f(byteArrayInputStream, m), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            a aVar = aVarArr[i13];
            int available = byteArrayInputStream.available();
            int i14 = aVar.f27246f;
            int i15 = aVar.f27247g;
            TreeMap treeMap = aVar.i;
            int i16 = available - i14;
            int i17 = i11;
            while (byteArrayInputStream.available() > i16) {
                i17 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i17), 1);
                int m11 = (int) m(byteArrayInputStream, 2);
                while (m11 > 0) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            int i18 = i11;
                            int i19 = i13;
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                            i11 = i18;
                            i13 = i19;
                        }
                    }
                    m11--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i20 = i11;
            int i21 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.f27248h = g(byteArrayInputStream, aVar.f27245e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i22 = i20; i22 < i15; i22++) {
                int i23 = valueOf.get(i22) ? 2 : i20;
                if (valueOf.get(i22 + i15)) {
                    i23 |= 4;
                }
                if (i23 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i22));
                    if (num == null) {
                        num = Integer.valueOf(i20);
                    }
                    treeMap.put(Integer.valueOf(i22), Integer.valueOf(i23 | num.intValue()));
                }
            }
            i13 = i21 + 1;
            i11 = i20;
        }
        return aVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f27252d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f27253e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b10 = b(aVarArr, bArr3);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr4 = f27255g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.i.size() * 4;
                    String d10 = d(bArr4, aVar.f27241a, aVar.f27242b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d10.getBytes(charset).length);
                    v(byteArrayOutputStream, aVar.f27248h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, aVar.f27243c, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset));
                    Iterator it = aVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : aVar.f27248h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f27254f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b11 = b(aVarArr, bArr5);
                u(byteArrayOutputStream, aVarArr.length, 1);
                u(byteArrayOutputStream, b11.length, 4);
                byte[] a11 = a(b11);
                u(byteArrayOutputStream, a11.length, 4);
                byteArrayOutputStream.write(a11);
                return true;
            }
            byte[] bArr6 = f27256h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f27241a;
                TreeMap treeMap = aVar2.i;
                String d11 = d(bArr6, str, aVar2.f27242b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar2.f27248h.length);
                u(byteArrayOutputStream, aVar2.f27243c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : aVar2.f27248h) {
                    v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, aVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (a aVar3 : aVarArr) {
                u(byteArrayOutputStream2, aVar3.f27243c, 4);
                u(byteArrayOutputStream2, aVar3.f27244d, 4);
                u(byteArrayOutputStream2, aVar3.f27247g, 4);
                String d12 = d(bArr2, aVar3.f27241a, aVar3.f27242b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i15];
                    v(byteArrayOutputStream3, i15);
                    v(byteArrayOutputStream3, aVar4.f27245e);
                    i16 = i16 + 4 + (aVar4.f27245e * i13);
                    int[] iArr = aVar4.f27248h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        v(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i21];
                    Iterator it3 = aVar5.i.entrySet().iterator();
                    int i23 = 0;
                    while (it3.hasNext()) {
                        i23 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i23, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i24 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i23);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i22 = i24 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i25 = 0;
            while (i25 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i25);
                int i26 = iVar4.f27267a;
                byte[] bArr7 = iVar4.f27268b;
                if (i26 == 1) {
                    j10 = 0;
                } else if (i26 == 2) {
                    j10 = 1;
                } else if (i26 == 3) {
                    j10 = 2;
                } else if (i26 == 4) {
                    j10 = 3;
                } else {
                    if (i26 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                u(byteArrayOutputStream, j10, 4);
                u(byteArrayOutputStream, size2, 4);
                if (iVar4.f27269c) {
                    long length5 = bArr7.length;
                    byte[] a12 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a12);
                    u(byteArrayOutputStream, a12.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a12.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i25++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i27));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        s(byteArrayOutputStream, aVar);
        int i10 = aVar.f27247g;
        int[] iArr = aVar.f27248h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            v(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i14 = intValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i15 = intValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f27245e);
        u(byteArrayOutputStream, aVar.f27246f, 4);
        u(byteArrayOutputStream, aVar.f27243c, 4);
        u(byteArrayOutputStream, aVar.f27247g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, a aVar) {
        int i11 = aVar.f27247g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & intValue2) == i13) {
                        int i14 = (i12 * i11) + intValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        int i10 = 0;
        for (Map.Entry entry : aVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, b bVar, boolean z10) {
        boolean z11;
        Object r72;
        byte[] bArr;
        a[] aVarArr;
        a[] aVarArr2;
        a[] aVarArr3;
        byte[] bArr2;
        boolean z12;
        boolean z13;
        Throwable th;
        Throwable th2;
        boolean z14;
        boolean z15;
        Object r73;
        boolean z16;
        aa.e eVar;
        String str;
        String str2;
        FileInputStream g7;
        boolean z17;
        boolean z18;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z18 = readLong == packageInfo.lastUpdateTime;
                            if (z18) {
                                bVar.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z18) {
                        context.getPackageName();
                        h.c(context, false);
                        return;
                    }
                }
                z18 = false;
                if (z18) {
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            aa.e eVar2 = new aa.e(assets, executor, bVar, name, file2);
            byte[] bArr3 = (byte[]) eVar2.f638d;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        eVar2.h(4, null);
                    }
                    eVar2.f635a = true;
                    try {
                        try {
                            r72 = eVar2.g(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e5) {
                            bVar.a(6, e5);
                            r72 = 0;
                            bArr = f27250b;
                            if (r72 != 0) {
                            }
                            aVarArr2 = (a[]) eVar2.f641g;
                            if (aVarArr2 != null) {
                            }
                            b bVar2 = (b) eVar2.f637c;
                            aVarArr3 = (a[]) eVar2.f641g;
                            byte[] bArr4 = (byte[]) eVar2.f638d;
                            boolean z19 = r72;
                            z19 = r72;
                            if (aVarArr3 != null) {
                            }
                            bArr2 = (byte[]) eVar2.f642h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z17 = z14;
                            h.c(context, (z15 || !z10) ? false : z17);
                        } catch (IOException e10) {
                            bVar.a(7, e10);
                            r72 = 0;
                            bArr = f27250b;
                            if (r72 != 0) {
                            }
                            aVarArr2 = (a[]) eVar2.f641g;
                            if (aVarArr2 != null) {
                            }
                            b bVar22 = (b) eVar2.f637c;
                            aVarArr3 = (a[]) eVar2.f641g;
                            byte[] bArr42 = (byte[]) eVar2.f638d;
                            boolean z192 = r72;
                            z192 = r72;
                            if (aVarArr3 != null) {
                            }
                            bArr2 = (byte[]) eVar2.f642h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z17 = z14;
                            h.c(context, (z15 || !z10) ? false : z17);
                        }
                        if (r72 != 0) {
                            try {
                            } catch (IOException e11) {
                                bVar.a(7, e11);
                                try {
                                    r72.close();
                                } catch (IOException e12) {
                                    bVar.a(7, e12);
                                }
                                aVarArr = null;
                                eVar2.f641g = aVarArr;
                                aVarArr2 = (a[]) eVar2.f641g;
                                if (aVarArr2 != null) {
                                }
                                b bVar222 = (b) eVar2.f637c;
                                aVarArr3 = (a[]) eVar2.f641g;
                                byte[] bArr422 = (byte[]) eVar2.f638d;
                                boolean z1922 = r72;
                                z1922 = r72;
                                if (aVarArr3 != null) {
                                }
                                bArr2 = (byte[]) eVar2.f642h;
                                if (bArr2 != null) {
                                }
                                if (z13) {
                                }
                                z15 = z13;
                                z17 = z14;
                                h.c(context, (z15 || !z10) ? false : z17);
                            } catch (IllegalStateException e13) {
                                bVar.a(8, e13);
                                r72.close();
                                aVarArr = null;
                                eVar2.f641g = aVarArr;
                                aVarArr2 = (a[]) eVar2.f641g;
                                if (aVarArr2 != null) {
                                }
                                b bVar2222 = (b) eVar2.f637c;
                                aVarArr3 = (a[]) eVar2.f641g;
                                byte[] bArr4222 = (byte[]) eVar2.f638d;
                                boolean z19222 = r72;
                                z19222 = r72;
                                if (aVarArr3 != null) {
                                }
                                bArr2 = (byte[]) eVar2.f642h;
                                if (bArr2 != null) {
                                }
                                if (z13) {
                                }
                                z15 = z13;
                                z17 = z14;
                                h.c(context, (z15 || !z10) ? false : z17);
                            }
                            if (!Arrays.equals(bArr, f(r72, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            aVarArr = l(r72, f(r72, 4), (String) eVar2.f640f);
                            try {
                                r72.close();
                            } catch (IOException e14) {
                                bVar.a(7, e14);
                            }
                            eVar2.f641g = aVarArr;
                        }
                        aVarArr2 = (a[]) eVar2.f641g;
                        if (aVarArr2 != null && (r72 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                g7 = eVar2.g(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e15) {
                                bVar.a(9, e15);
                                str = r72;
                            } catch (IOException e16) {
                                bVar.a(7, e16);
                                str = r72;
                            } catch (IllegalStateException e17) {
                                eVar2.f641g = null;
                                bVar.a(8, e17);
                                str = r72;
                            }
                            if (g7 == null) {
                                try {
                                    if (!Arrays.equals(f27251c, f(g7, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f6 = f(g7, 4);
                                    eVar2.f641g = i(g7, f6, bArr3, aVarArr2);
                                    g7.close();
                                    eVar = eVar2;
                                    r72 = f6;
                                    if (eVar != null) {
                                        eVar2 = eVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (g7 != null) {
                                    g7.close();
                                    str = str2;
                                }
                                eVar = null;
                                r72 = str;
                                if (eVar != null) {
                                }
                            }
                        }
                        b bVar22222 = (b) eVar2.f637c;
                        aVarArr3 = (a[]) eVar2.f641g;
                        byte[] bArr42222 = (byte[]) eVar2.f638d;
                        boolean z192222 = r72;
                        z192222 = r72;
                        if (aVarArr3 != null && bArr42222 != null) {
                            r73 = eVar2.f635a;
                            if (r73 != 0) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                r73 = new ByteArrayOutputStream();
                                try {
                                    r73.write(bArr);
                                    r73.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e18) {
                                bVar22222.a(7, e18);
                                z16 = r73;
                            } catch (IllegalStateException e19) {
                                bVar22222.a(8, e19);
                                z16 = r73;
                            }
                            if (o(r73, bArr42222, aVarArr3)) {
                                eVar2.f642h = r73.toByteArray();
                                r73.close();
                                z16 = r73;
                                eVar2.f641g = null;
                                z192222 = z16;
                            } else {
                                bVar22222.a(5, null);
                                eVar2.f641g = null;
                                r73.close();
                                z192222 = r73;
                            }
                        }
                        bArr2 = (byte[]) eVar2.f642h;
                        if (bArr2 != null) {
                            z13 = false;
                            z14 = true;
                        } else {
                            try {
                                if (!eVar2.f635a) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) eVar2.f639e);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z14 = true;
                                                                                eVar2.h(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                eVar2.f642h = null;
                                                                                eVar2.f641g = null;
                                                                                z13 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e20) {
                                        e = e20;
                                        z192222 = true;
                                        eVar2.h(6, e);
                                        z12 = z192222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z17 = z14;
                                        h.c(context, (z15 || !z10) ? false : z17);
                                    } catch (IOException e21) {
                                        e = e21;
                                        z192222 = true;
                                        eVar2.h(7, e);
                                        z12 = z192222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z17 = z14;
                                        h.c(context, (z15 || !z10) ? false : z17);
                                    }
                                } catch (FileNotFoundException e22) {
                                    e = e22;
                                    eVar2.h(6, e);
                                    z12 = z192222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z17 = z14;
                                    h.c(context, (z15 || !z10) ? false : z17);
                                } catch (IOException e23) {
                                    e = e23;
                                    eVar2.h(7, e);
                                    z12 = z192222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z17 = z14;
                                    h.c(context, (z15 || !z10) ? false : z17);
                                }
                            } finally {
                                eVar2.f642h = null;
                                eVar2.f641g = null;
                            }
                        }
                        if (z13) {
                            e(packageInfo, filesDir);
                        }
                        z15 = z13;
                        z17 = z14;
                    } finally {
                    }
                    bArr = f27250b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            eVar2.h(4, null);
                        }
                        eVar2.f635a = true;
                        r72 = eVar2.g(assets, "dexopt/baseline.prof");
                        bArr = f27250b;
                        if (r72 != 0) {
                        }
                        aVarArr2 = (a[]) eVar2.f641g;
                        if (aVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            g7 = eVar2.g(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (g7 == null) {
                            }
                        }
                        b bVar222222 = (b) eVar2.f637c;
                        aVarArr3 = (a[]) eVar2.f641g;
                        byte[] bArr422222 = (byte[]) eVar2.f638d;
                        boolean z1922222 = r72;
                        z1922222 = r72;
                        if (aVarArr3 != null) {
                            r73 = eVar2.f635a;
                            if (r73 != 0) {
                            }
                        }
                        bArr2 = (byte[]) eVar2.f642h;
                        if (bArr2 != null) {
                        }
                        if (z13) {
                        }
                        z15 = z13;
                        z17 = z14;
                    } catch (IOException unused2) {
                        z11 = true;
                        eVar2.h(4, null);
                    }
                }
                h.c(context, (z15 || !z10) ? false : z17);
            }
            eVar2.h(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = true;
            z15 = false;
            z17 = z11;
            h.c(context, (z15 || !z10) ? false : z17);
        } catch (PackageManager.NameNotFoundException e24) {
            bVar.a(7, e24);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        u(byteArrayOutputStream, i10, 2);
    }
}
