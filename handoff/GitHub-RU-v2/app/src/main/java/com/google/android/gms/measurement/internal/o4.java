package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.zzmr;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 implements x1 {
    public static volatile o4 b0;
    public e1 B;
    public final o1 C;
    public boolean E;
    public long F;
    public ArrayList G;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public FileLock N;
    public FileChannel O;
    public ArrayList P;
    public ArrayList Q;
    public final HashMap S;
    public final HashMap T;
    public final HashMap U;
    public b3 W;
    public String X;
    public w3 Y;
    public long Z;
    public final i1 r;
    public final w0 s;
    public o t;
    public y0 u;
    public d4 v;
    public d w;
    public final w0 x;
    public w0 y;
    public r3 z;
    public final AtomicBoolean D = new AtomicBoolean(false);
    public final LinkedList H = new LinkedList();
    public final HashMap V = new HashMap();
    public final l4 a0 = new l4(this);
    public long R = -1;
    public final k4 A = new k4(this);

    public o4(a7.d dVar) {
        this.C = o1.s(dVar.a, null, null);
        w0 w0Var = new w0(this, 2);
        w0Var.B();
        this.x = w0Var;
        w0 w0Var2 = new w0(this, 0);
        w0Var2.B();
        this.s = w0Var2;
        i1 i1Var = new i1(this);
        i1Var.B();
        this.r = i1Var;
        this.S = new HashMap();
        this.T = new HashMap();
        this.U = new HashMap();
        b().I(new androidx.fragment.app.o(this, dVar));
    }

    public static o4 C(Context context) {
        c21.u.g(context);
        c21.u.g(context.getApplicationContext());
        if (b0 == null) {
            synchronized (o4.class) {
                try {
                    if (b0 == null) {
                        b0 = new o4(new a7.d(context, 2));
                    }
                } finally {
                }
            }
        }
        return b0;
    }

    public static final void D(com.google.android.gms.internal.measurement.a3 a3Var, int i, String str) {
        List i2 = a3Var.i();
        for (int i3 = 0; i3 < i2.size(); i3++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.e3) i2.get(i3)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
        B.i("_err");
        B.k(i);
        com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) B.e();
        com.google.android.gms.internal.measurement.d3 B2 = com.google.android.gms.internal.measurement.e3.B();
        B2.i("_ev");
        B2.j(str);
        com.google.android.gms.internal.measurement.e3 e3Var2 = (com.google.android.gms.internal.measurement.e3) B2.e();
        a3Var.l(e3Var);
        a3Var.l(e3Var2);
    }

    public static final void E(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        List i = a3Var.i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            if (str.equals(((com.google.android.gms.internal.measurement.e3) i.get(i2)).q())) {
                a3Var.o(i2);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(v4 v4Var) {
        return !TextUtils.isEmpty(v4Var.s);
    }

    public static final void U(i4 i4Var) {
        if (i4Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!i4Var.u) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(i4Var.getClass())));
        }
    }

    public static final Boolean V(v4 v4Var) {
        Boolean bool = v4Var.G;
        String str = v4Var.T;
        if (!TextUtils.isEmpty(str)) {
            int ordinal = ((y1) y51.c.q(str).s).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x0030, B:13:0x004e, B:14:0x015d, B:23:0x006c, B:27:0x00c8, B:28:0x00b6, B:29:0x00cd, B:33:0x00de, B:34:0x00f4, B:36:0x010c, B:37:0x0127, B:39:0x0130, B:41:0x0136, B:42:0x013a, B:44:0x0143, B:46:0x0152, B:47:0x015a, B:48:0x0118, B:49:0x00e5, B:51:0x00ee), top: B:4:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        w0 w0Var = this.s;
        b().z();
        l0();
        c21.u.d(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.K = false;
                O();
                throw th2;
            }
        }
        q0 q0Var = a().F;
        Integer valueOf = Integer.valueOf(bArr.length);
        q0Var.b(valueOf, "onConfigFetched. Response size");
        o oVar = this.t;
        U(oVar);
        oVar.l0();
        try {
            o oVar2 = this.t;
            U(oVar2);
            x0 B0 = oVar2.B0(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (B0 == null) {
                    a().A.b(s0.H(str), "App does not exist in onConfigFetched. appId");
                } else {
                    i1 i1Var = this.r;
                    if (z || i == 404) {
                        String M = M("Last-Modified", map);
                        String M2 = M("ETag", map);
                        if (i != 404 && i != 304) {
                            U(i1Var);
                            i1Var.N(str, bArr, M, M2);
                            f().getClass();
                            B0.f(System.currentTimeMillis());
                            o oVar3 = this.t;
                            U(oVar3);
                            oVar3.C0(B0, false);
                            if (i != 404) {
                                a().C.b(str, "Config not found. Using empty config. appId");
                            } else {
                                a().F.c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                            }
                            U(w0Var);
                            if (w0Var.T() || !L()) {
                                U(w0Var);
                                if (w0Var.T()) {
                                    o oVar4 = this.t;
                                    U(oVar4);
                                    if (oVar4.F(B0.D())) {
                                        t(B0.D());
                                    }
                                }
                                N();
                            } else {
                                q();
                            }
                        }
                        U(i1Var);
                        if (i1Var.L(str) == null) {
                            U(i1Var);
                            i1Var.N(str, null, null, null);
                        }
                        f().getClass();
                        B0.f(System.currentTimeMillis());
                        o oVar32 = this.t;
                        U(oVar32);
                        oVar32.C0(B0, false);
                        if (i != 404) {
                        }
                        U(w0Var);
                        if (w0Var.T()) {
                        }
                        U(w0Var);
                        if (w0Var.T()) {
                        }
                        N();
                    } else {
                        f().getClass();
                        B0.g(System.currentTimeMillis());
                        o oVar5 = this.t;
                        U(oVar5);
                        oVar5.C0(B0, false);
                        a().F.c("Fetching config failed. code, error", Integer.valueOf(i), th);
                        U(i1Var);
                        i1Var.z();
                        i1Var.E.put(str, (Object) null);
                        a1 a1Var = this.z.A;
                        f().getClass();
                        a1Var.b(System.currentTimeMillis());
                        if (i == 503 || i == 429) {
                            a1 a1Var2 = this.z.y;
                            f().getClass();
                            a1Var2.b(System.currentTimeMillis());
                        }
                        N();
                    }
                }
                o oVar6 = this.t;
                U(oVar6);
                oVar6.m0();
                this.K = false;
                O();
            }
            if (th == null) {
                z = true;
                if (B0 == null) {
                }
                o oVar62 = this.t;
                U(oVar62);
                oVar62.m0();
                this.K = false;
                O();
            }
            z = false;
            if (B0 == null) {
            }
            o oVar622 = this.t;
            U(oVar622);
            oVar622.m0();
            this.K = false;
            O();
        } finally {
            o oVar7 = this.t;
            U(oVar7);
            oVar7.n0();
        }
    }

    public final void B() {
        b().z();
        l0();
        if (this.E) {
            return;
        }
        this.E = true;
        b().z();
        FileLock fileLock = this.N;
        o1 o1Var = this.C;
        if (fileLock == null || !fileLock.isValid()) {
            ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.t).s).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(o1Var.r.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.O = channel;
                FileLock tryLock = channel.tryLock();
                this.N = tryLock;
                if (tryLock == null) {
                    a().x.a("Storage concurrent data access panic");
                    return;
                }
                a().F.a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                a().x.b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                a().x.b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                a().A.b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            a().F.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.O;
        b().z();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().x.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    a().A.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                a().x.b(e4, "Failed to read from channel");
            }
        }
        k0 r = o1Var.r();
        r.A();
        int i2 = r.w;
        b().z();
        if (i > i2) {
            a().x.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        if (i < i2) {
            FileChannel fileChannel2 = this.O;
            b().z();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().x.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i2);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().x.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().F.c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                    return;
                } catch (IOException e5) {
                    a().x.b(e5, "Failed to write to channel");
                }
            }
            a().x.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final int F(String str, y51.c cVar) {
        y1 D;
        i1 i1Var = this.r;
        com.google.android.gms.internal.measurement.a2 U = i1Var.U(str);
        a2 a2Var = a2.AD_PERSONALIZATION;
        if (U == null) {
            cVar.r(a2Var, i.FAILSAFE);
            return 1;
        }
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str);
        if (B0 == null || ((y1) y51.c.q(B0.s()).s) != y1.POLICY || (D = i1Var.D(str, a2Var)) == y1.UNINITIALIZED) {
            cVar.r(a2Var, i.REMOTE_DEFAULT);
            if (i1Var.T(str, a2Var)) {
                return 0;
            }
        } else {
            cVar.r(a2Var, i.REMOTE_ENFORCED_DEFAULT);
            if (D == y1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(com.google.android.gms.internal.measurement.b3 b3Var) {
        Serializable O;
        HashMap hashMap = new HashMap();
        j0();
        HashMap hashMap2 = new HashMap();
        for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.p()) {
            if (e3Var.q().startsWith("gad_") && (O = w0.O(e3Var)) != null) {
                hashMap2.put(e3Var.q(), O);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    public final void H() {
        b().z();
        if (this.H.isEmpty()) {
            return;
        }
        if (this.Y == null) {
            this.Y = new w3(this, this.C, 2);
        }
        if (this.Y.c != 0) {
            return;
        }
        f().getClass();
        long max = Math.max(0L, ((Integer) c0.B0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.Z));
        a().F.b(Long.valueOf(max), "Scheduling notify next app runnable, delay in ms");
        if (this.Y == null) {
            this.Y = new w3(this, this.C, 2);
        }
        this.Y.b(max);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(3:8|9|(4:11|12|(4:14|(1:21)|22|23)(29:25|26|(23:33|34|(2:36|(3:38|(4:41|(2:47|48)|49|39)|53))|54|55|(3:57|58|(9:245|(11:114|(5:118|(2:120|121)(2:123|(2:125|126)(1:127))|122|116|115)|128|129|(2:224|(3:229|(1:231)(2:233|(3:235|(3:238|(1:240)(1:241)|236)|242)(0))|232)(1:228))(1:131)|132|(2:134|(2:(2:139|(2:141|142))|189)(3:190|191|192))(2:193|(4:195|(2:(2:200|(2:202|142))|203)|191|192)(3:204|(2:215|(2:216|(2:218|(2:221|222)(1:220))(1:223)))(0)|192))|143|(9:145|(4:148|(2:165|(2:167|168)(1:169))(5:152|(5:155|(2:158|156)|159|160|153)|161|162|163)|164|146)|170|171|(4:174|(3:176|177|178)(1:180)|179|172)|181|182|(1:184)|185)(1:188)|186|187)|243|132|(0)(0)|143|(0)(0)|186|187))(1:246)|62|(3:63|64|(3:66|(2:68|69)(2:71|(2:73|74)(2:75|76))|70)(1:77))|78|(1:81)|(1:83)|84|(1:86)(1:244)|87|(5:92|(4:95|(2:97|98)(2:100|(2:102|103)(1:104))|99|93)|105|(1:(1:108)(1:109))|(1:111)(1:112))|(0)|243|132|(0)(0)|143|(0)(0)|186|187)|247|(2:249|(24:255|256|34|(0)|54|55|(0)(0)|62|(4:63|64|(0)(0)|70)|78|(1:81)|(0)|84|(0)(0)|87|(6:90|92|(1:93)|105|(0)|(0)(0))|(0)|243|132|(0)(0)|143|(0)(0)|186|187))|257|256|34|(0)|54|55|(0)(0)|62|(4:63|64|(0)(0)|70)|78|(0)|(0)|84|(0)(0)|87|(0)|(0)|243|132|(0)(0)|143|(0)(0)|186|187)|24)(1:258))|259|(5:261|(2:263|(3:265|266|267))|268|(1:281)(3:270|(1:272)(1:280)|(2:276|277))|267)|282|283|(3:284|285|(1:515)(2:287|(2:289|290)(1:514)))|291|(1:293)(2:511|(1:513))|294|(1:296)(1:510)|297|(1:299)(1:509)|300|(6:303|(1:305)|306|(2:308|309)(1:311)|310|301)|312|313|(2:504|(1:508))(1:317)|318|(1:320)|321|(1:323)|324|(2:326|(1:332))|333|(8:335|(8:339|340|(4:342|(2:344|(1:346))|(1:367)(5:350|(1:354)|355|(1:365)(1:359)|360)|361)(8:368|(7:431|432|371|(3:373|(3:376|(3:379|380|(3:382|383|(1:385)(6:386|(1:390)|391|(1:393)(1:427)|394|(3:396|(1:404)|405)(5:406|(3:408|(1:410)|411)(4:414|(1:416)(1:426)|417|(3:419|(1:421)|422)(2:423|(1:425)))|412|413|364)))(2:428|(0)(0)))(1:378)|374)|429)|430|383|(0)(0))|370|371|(0)|430|383|(0)(0))|362|363|364|337|336)|436|437|(1:439)|440|(2:443|441)|444)(1:503)|445|(1:447)(2:484|(20:486|(1:488)(1:502)|489|(1:491)(1:501)|492|(1:494)(1:500)|495|(1:497)(1:499)|498|449|(5:451|(2:456|457)|458|(1:460)(1:461)|457)|462|(3:(2:466|467)(1:469)|468|463)|470|471|(1:473)|474|475|476|477))|448|449|(0)|462|(1:463)|470|471|(0)|474|475|476|477) */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0f20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0f21, code lost:
    
        ((com.google.android.gms.measurement.internal.o1) ((androidx.compose.foundation.lazy.layout.s0) r2).s).a().D().c("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.s0.H(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0b18 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b64 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b87 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0e33 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0ef1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025c A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02cd A[EDGE_INSN: B:77:0x02cd->B:78:0x02cd BREAK  A[LOOP:2: B:63:0x0252->B:70:0x02c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ff A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x035c A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:7:0x003e, B:8:0x005e, B:11:0x0076, B:14:0x00a4, B:16:0x00e1, B:19:0x00fa, B:21:0x0104, B:24:0x0712, B:25:0x0132, B:28:0x0144, B:30:0x014a, B:34:0x018e, B:36:0x01a0, B:39:0x01c7, B:41:0x01cd, B:43:0x01dd, B:45:0x01eb, B:47:0x01fb, B:49:0x0206, B:54:0x0209, B:57:0x0221, B:63:0x0252, B:66:0x025c, B:68:0x026a, B:70:0x02c6, B:71:0x028e, B:73:0x029e, B:81:0x02d5, B:83:0x02ff, B:84:0x0327, B:86:0x035c, B:87:0x0362, B:90:0x036e, B:92:0x03a3, B:93:0x03c0, B:95:0x03c6, B:97:0x03d4, B:99:0x03e8, B:100:0x03dc, B:108:0x03ef, B:111:0x03f6, B:112:0x0415, B:114:0x0430, B:115:0x043c, B:118:0x0446, B:122:0x0469, B:123:0x0458, B:132:0x04e3, B:134:0x04ef, B:137:0x0500, B:139:0x0511, B:141:0x051d, B:143:0x05e2, B:145:0x05e8, B:146:0x05f4, B:148:0x05fa, B:150:0x060a, B:152:0x0614, B:153:0x0627, B:155:0x062d, B:156:0x0646, B:158:0x064c, B:160:0x066a, B:162:0x0678, B:164:0x069f, B:165:0x067e, B:167:0x068a, B:171:0x06a6, B:172:0x06c3, B:174:0x06c9, B:177:0x06dc, B:182:0x06e9, B:184:0x06f0, B:186:0x06fe, B:193:0x0538, B:195:0x0546, B:198:0x0557, B:200:0x0568, B:202:0x0574, B:204:0x0583, B:206:0x0592, B:209:0x059e, B:211:0x05a8, B:213:0x05b2, B:216:0x05bd, B:218:0x05c3, B:222:0x05d3, B:220:0x05de, B:224:0x0471, B:226:0x047d, B:228:0x0489, B:232:0x04cd, B:233:0x04a5, B:236:0x04b7, B:238:0x04bd, B:240:0x04c7, B:247:0x0154, B:249:0x0161, B:251:0x016f, B:253:0x0175, B:256:0x0180, B:261:0x072b, B:263:0x073d, B:265:0x0746, B:267:0x0776, B:268:0x074e, B:270:0x0757, B:272:0x075d, B:274:0x0769, B:276:0x0771, B:283:0x0779, B:284:0x0785, B:287:0x078d, B:290:0x079f, B:291:0x07aa, B:293:0x07b2, B:294:0x07e1, B:296:0x07fd, B:297:0x0812, B:299:0x082e, B:300:0x0843, B:301:0x085f, B:303:0x0865, B:305:0x087d, B:306:0x088b, B:308:0x089b, B:310:0x08a9, B:313:0x08ac, B:315:0x08f6, B:317:0x08fc, B:318:0x0927, B:320:0x092f, B:321:0x094d, B:323:0x0953, B:324:0x0967, B:326:0x097e, B:328:0x098f, B:330:0x09a1, B:332:0x09ab, B:333:0x09ae, B:335:0x0a09, B:336:0x0a1c, B:339:0x0a24, B:342:0x0a43, B:344:0x0a5c, B:346:0x0a71, B:348:0x0a76, B:350:0x0a7a, B:352:0x0a7e, B:354:0x0a88, B:355:0x0a91, B:357:0x0a95, B:359:0x0a9b, B:360:0x0aa6, B:361:0x0ab4, B:364:0x0d1b, B:368:0x0abd, B:432:0x0adb, B:371:0x0af8, B:373:0x0b18, B:374:0x0b20, B:376:0x0b26, B:380:0x0b38, B:383:0x0b4e, B:385:0x0b64, B:386:0x0b87, B:388:0x0b93, B:390:0x0ba9, B:391:0x0be9, B:396:0x0c05, B:398:0x0c10, B:400:0x0c14, B:402:0x0c18, B:404:0x0c1c, B:405:0x0c28, B:406:0x0c2d, B:408:0x0c33, B:410:0x0c4b, B:411:0x0c50, B:412:0x0d18, B:414:0x0c8f, B:416:0x0c94, B:419:0x0ca8, B:421:0x0cc7, B:422:0x0cce, B:425:0x0d0c, B:426:0x0c99, B:435:0x0ae1, B:437:0x0d26, B:439:0x0d33, B:440:0x0d47, B:441:0x0d4f, B:443:0x0d55, B:445:0x0d6b, B:447:0x0d7d, B:449:0x0e2d, B:451:0x0e33, B:453:0x0e48, B:456:0x0e4f, B:457:0x0e92, B:458:0x0e5e, B:460:0x0e6c, B:461:0x0e79, B:462:0x0ea1, B:463:0x0eba, B:466:0x0ec2, B:468:0x0ec7, B:471:0x0ed7, B:473:0x0ef1, B:474:0x0f0e, B:476:0x0f16, B:477:0x0f36, B:483:0x0f21, B:484:0x0d99, B:486:0x0d9f, B:488:0x0daf, B:489:0x0db6, B:494:0x0dcc, B:495:0x0dd3, B:497:0x0e1e, B:498:0x0e25, B:499:0x0e22, B:500:0x0dd0, B:502:0x0db3, B:504:0x090c, B:506:0x0912, B:508:0x0918, B:509:0x0840, B:510:0x080f, B:511:0x07b8, B:513:0x07be, B:517:0x0f3f), top: B:2:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(String str, long j) {
        boolean z;
        int i;
        Long l;
        o1 o1Var;
        long j2;
        int i2;
        ArrayList arrayList;
        int i3;
        int delete;
        Long l2;
        long j3;
        long parseLong;
        long j4;
        int i4;
        HashMap hashMap;
        long r;
        Long l3;
        String str2;
        int i5;
        String str3;
        boolean P;
        boolean z2;
        com.google.android.gms.internal.measurement.i3 i3Var;
        String str4;
        String str5;
        int i6;
        String str6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int i10;
        boolean z5;
        com.google.android.gms.internal.measurement.d3 d3Var;
        com.google.android.gms.internal.measurement.i3 i3Var2;
        o4 o4Var = this;
        String str7 = "1";
        String str8 = "_ai";
        String str9 = "purchase";
        String str10 = "items";
        Long l4 = 1L;
        o4Var.g0().l0();
        try {
            b1 b1Var = new b1(o4Var);
            o4Var.g0().h0(str, j, o4Var.R, b1Var);
            ArrayList arrayList2 = (ArrayList) b1Var.d;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                g0().m0();
                z = false;
            } else {
                com.google.android.gms.internal.measurement.i3 i3Var3 = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.j3) b1Var.b).i();
                i3Var3.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var3.s).a0();
                int i12 = -1;
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                boolean z6 = false;
                boolean z7 = false;
                com.google.android.gms.internal.measurement.a3 a3Var = null;
                com.google.android.gms.internal.measurement.a3 a3Var2 = null;
                while (true) {
                    int size = ((ArrayList) b1Var.d).size();
                    i = i15;
                    l = l4;
                    o1Var = o4Var.C;
                    if (i14 >= size) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.a3 a3Var3 = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.b3) ((ArrayList) b1Var.d).get(i14)).i();
                    int i16 = i14;
                    String str11 = str10;
                    if (o4Var.f0().O(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var3.p())) {
                        o4Var.a().E().c("Dropping blocked raw event. appId", s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), o1Var.n().a(a3Var3.p()));
                        if (!str7.equals(o4Var.f0().e(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), "measurement.upload.blacklist_internal")) && !str7.equals(o4Var.f0().e(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), "measurement.upload.blacklist_public")) && !"_err".equals(a3Var3.p())) {
                            o4Var.k0();
                            t4.P(o4Var.a0, ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), 11, "_ev", a3Var3.p(), 0);
                        }
                        str2 = str7;
                        str5 = str8;
                        str4 = str9;
                        i15 = i;
                        i7 = i16;
                        str6 = str11;
                    } else {
                        String p = a3Var3.p();
                        str2 = str7;
                        if (!p.equals(str9) && !p.equals("_iap") && !p.equals("ecommerce_purchase")) {
                            i5 = i12;
                            if (a3Var3.p().equals(c2.g(str8, c2.c, c2.a))) {
                                a3Var3.b();
                                ((com.google.android.gms.internal.measurement.b3) a3Var3.s).F(str8);
                                o4Var.a().G().a("Renaming ad_impression to _ai");
                                if (Log.isLoggable(o4Var.a().J(), 5)) {
                                    for (int i17 = 0; i17 < a3Var3.j(); i17++) {
                                        if ("ad_platform".equals(a3Var3.k(i17).q()) && !a3Var3.k(i17).s().isEmpty() && "admob".equalsIgnoreCase(a3Var3.k(i17).s())) {
                                            o4Var.a().C.a("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            P = o4Var.f0().P(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var3.p());
                            if (P) {
                                z2 = P;
                            } else {
                                o4Var.j0();
                                String p2 = a3Var3.p();
                                c21.u.d(p2);
                                z2 = P;
                                if (p2.hashCode() != 95027 || !p2.equals("_ui")) {
                                    str5 = str8;
                                    str4 = str9;
                                    i3Var = i3Var3;
                                    z2 = false;
                                    if (z2) {
                                        ArrayList arrayList3 = new ArrayList(a3Var3.i());
                                        int i18 = -1;
                                        int i19 = -1;
                                        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                                            if ("value".equals(((com.google.android.gms.internal.measurement.e3) arrayList3.get(i20)).q())) {
                                                i18 = i20;
                                            } else if ("currency".equals(((com.google.android.gms.internal.measurement.e3) arrayList3.get(i20)).q())) {
                                                i19 = i20;
                                            }
                                        }
                                        if (i18 != -1) {
                                            if (((com.google.android.gms.internal.measurement.e3) arrayList3.get(i18)).t() || ((com.google.android.gms.internal.measurement.e3) arrayList3.get(i18)).x()) {
                                                if (i19 != -1) {
                                                    String s = ((com.google.android.gms.internal.measurement.e3) arrayList3.get(i19)).s();
                                                    if (s.length() == 3) {
                                                        int i22 = 0;
                                                        while (i22 < s.length()) {
                                                            int codePointAt = s.codePointAt(i22);
                                                            if (Character.isLetter(codePointAt)) {
                                                                i22 += Character.charCount(codePointAt);
                                                            }
                                                        }
                                                    }
                                                }
                                                o4Var.a().C.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                a3Var3.o(i18);
                                                E(a3Var3, "_c");
                                                D(a3Var3, 19, "currency");
                                                break;
                                            }
                                            o4Var.a().C.a("Value must be specified with a numeric type.");
                                            a3Var3.o(i18);
                                            E(a3Var3, "_c");
                                            D(a3Var3, 18, "value");
                                        }
                                        if ("_e".equals(a3Var3.p())) {
                                            o4Var.j0();
                                            if (w0.H((com.google.android.gms.internal.measurement.b3) a3Var3.e(), "_fr") == null) {
                                                if (a3Var2 != null && Math.abs(a3Var2.q() - a3Var3.q()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.a3 a3Var4 = (com.google.android.gms.internal.measurement.a3) a3Var2.clone();
                                                    if (o4Var.K(a3Var3, a3Var4)) {
                                                        i3Var3 = i3Var;
                                                        i3Var3.Z(i13, a3Var4);
                                                        i12 = i5;
                                                        a3Var = null;
                                                        a3Var2 = null;
                                                    }
                                                }
                                                i3Var3 = i3Var;
                                                a3Var = a3Var3;
                                                i12 = i;
                                            } else {
                                                i3Var3 = i3Var;
                                                i6 = i5;
                                                i12 = i6;
                                            }
                                        } else {
                                            i3Var3 = i3Var;
                                            if ("_vs".equals(a3Var3.p())) {
                                                o4Var.j0();
                                                if (w0.H((com.google.android.gms.internal.measurement.b3) a3Var3.e(), "_et") == null) {
                                                    if (a3Var != null && Math.abs(a3Var.q() - a3Var3.q()) <= 1000) {
                                                        com.google.android.gms.internal.measurement.a3 a3Var5 = (com.google.android.gms.internal.measurement.a3) a3Var.clone();
                                                        if (o4Var.K(a3Var5, a3Var3)) {
                                                            int i23 = i5;
                                                            i3Var3.Z(i23, a3Var5);
                                                            i12 = i23;
                                                            a3Var = null;
                                                            a3Var2 = null;
                                                        }
                                                    }
                                                    i12 = i5;
                                                    a3Var2 = a3Var3;
                                                    i13 = i;
                                                }
                                                i6 = i5;
                                                i12 = i6;
                                            } else {
                                                i6 = i5;
                                                if (o4Var.e0().J(null, c0.j1) && (("_f".equals(a3Var3.p()) || "_v".equals(a3Var3.p())) && ("_f".equals(a3Var3.p()) || "_v".equals(a3Var3.p())))) {
                                                    int i24 = 0;
                                                    while (true) {
                                                        if (i24 >= a3Var3.j()) {
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.e3 k = a3Var3.k(i24);
                                                        if ("_elt".equals(k.q())) {
                                                            a3Var3.s(k.u());
                                                            a3Var3.o(i24);
                                                            break;
                                                        }
                                                        i24++;
                                                    }
                                                }
                                                i12 = i6;
                                            }
                                        }
                                        if (a3Var3.j() != 0) {
                                            o4Var.j0();
                                            Bundle G = w0.G(a3Var3.i());
                                            int i25 = 0;
                                            while (i25 < a3Var3.j()) {
                                                com.google.android.gms.internal.measurement.e3 k2 = a3Var3.k(i25);
                                                String str12 = str11;
                                                if (!k2.q().equals(str12) || k2.z().isEmpty()) {
                                                    i8 = i25;
                                                    if (!k2.q().equals(str12)) {
                                                        o4Var.x(a3Var3.p(), (com.google.android.gms.internal.measurement.d3) k2.i(), G, ((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                                                    }
                                                } else {
                                                    String p3 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                                                    List z8 = k2.z();
                                                    Bundle[] bundleArr = new Bundle[z8.size()];
                                                    int i26 = 0;
                                                    while (i26 < z8.size()) {
                                                        com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) z8.get(i26);
                                                        o4Var.j0();
                                                        Bundle G2 = w0.G(e3Var.z());
                                                        Iterator it = e3Var.z().iterator();
                                                        while (it.hasNext()) {
                                                            o4Var.x(a3Var3.p(), (com.google.android.gms.internal.measurement.d3) ((com.google.android.gms.internal.measurement.e3) it.next()).i(), G2, p3);
                                                            i25 = i25;
                                                            z8 = z8;
                                                        }
                                                        bundleArr[i26] = G2;
                                                        i26++;
                                                        i25 = i25;
                                                        z8 = z8;
                                                    }
                                                    i8 = i25;
                                                    G.putParcelableArray(str12, bundleArr);
                                                }
                                                i25 = i8 + 1;
                                                str11 = str12;
                                            }
                                            str6 = str11;
                                            a3Var3.b();
                                            ((com.google.android.gms.internal.measurement.b3) a3Var3.s).D();
                                            w0 j0 = o4Var.j0();
                                            ArrayList arrayList4 = new ArrayList();
                                            for (String str13 : G.keySet()) {
                                                com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
                                                B.i(str13);
                                                Object obj = G.get(str13);
                                                if (obj != null) {
                                                    j0.Z(B, obj);
                                                    arrayList4.add((com.google.android.gms.internal.measurement.e3) B.e());
                                                }
                                            }
                                            int size2 = arrayList4.size();
                                            int i27 = 0;
                                            while (i27 < size2) {
                                                Object obj2 = arrayList4.get(i27);
                                                i27++;
                                                a3Var3.l((com.google.android.gms.internal.measurement.e3) obj2);
                                            }
                                        } else {
                                            str6 = str11;
                                        }
                                        i7 = i16;
                                        ((ArrayList) b1Var.d).set(i7, (com.google.android.gms.internal.measurement.b3) a3Var3.e());
                                        i3Var3.a0(a3Var3);
                                        i15 = i + 1;
                                    }
                                    if ("_e".equals(a3Var3.p())) {
                                    }
                                    if (a3Var3.j() != 0) {
                                    }
                                    i7 = i16;
                                    ((ArrayList) b1Var.d).set(i7, (com.google.android.gms.internal.measurement.b3) a3Var3.e());
                                    i3Var3.a0(a3Var3);
                                    i15 = i + 1;
                                }
                            }
                            str5 = str8;
                            i9 = 0;
                            z3 = false;
                            z4 = false;
                            while (true) {
                                str4 = str9;
                                if (i9 >= a3Var3.j()) {
                                    break;
                                }
                                if ("_c".equals(a3Var3.k(i9).q())) {
                                    com.google.android.gms.internal.measurement.d3 d3Var2 = (com.google.android.gms.internal.measurement.d3) a3Var3.k(i9).i();
                                    i3Var2 = i3Var3;
                                    d3Var2.k(1L);
                                    com.google.android.gms.internal.measurement.e3 e3Var2 = (com.google.android.gms.internal.measurement.e3) d3Var2.e();
                                    a3Var3.b();
                                    ((com.google.android.gms.internal.measurement.b3) a3Var3.s).A(i9, e3Var2);
                                    z3 = true;
                                } else {
                                    i3Var2 = i3Var3;
                                    if ("_r".equals(a3Var3.k(i9).q())) {
                                        com.google.android.gms.internal.measurement.d3 d3Var3 = (com.google.android.gms.internal.measurement.d3) a3Var3.k(i9).i();
                                        d3Var3.k(1L);
                                        com.google.android.gms.internal.measurement.e3 e3Var3 = (com.google.android.gms.internal.measurement.e3) d3Var3.e();
                                        a3Var3.b();
                                        ((com.google.android.gms.internal.measurement.b3) a3Var3.s).A(i9, e3Var3);
                                        z4 = true;
                                        z3 = z3;
                                    }
                                }
                                i9++;
                                str9 = str4;
                                i3Var3 = i3Var2;
                            }
                            i3Var = i3Var3;
                            if (!z3 && z2) {
                                o4Var.a().G().b(o1Var.n().a(a3Var3.p()), "Marking event as conversion");
                                com.google.android.gms.internal.measurement.d3 B2 = com.google.android.gms.internal.measurement.e3.B();
                                B2.i("_c");
                                B2.k(1L);
                                a3Var3.n(B2);
                            }
                            if (!z4) {
                                o4Var.a().G().b(o1Var.n().a(a3Var3.p()), "Marking event as real-time");
                                com.google.android.gms.internal.measurement.d3 B3 = com.google.android.gms.internal.measurement.e3.B();
                                B3.i("_r");
                                B3.k(1L);
                                a3Var3.n(B3);
                            }
                            if (o4Var.g0().D0(o4Var.g(), ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), false, true, false, false).e > o4Var.e0().H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.p)) {
                                E(a3Var3, "_r");
                            } else {
                                z7 = true;
                            }
                            if (t4.y0(a3Var3.p()) && z2 && o4Var.g0().D0(o4Var.g(), ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), true, false, false, false).c > o4Var.e0().H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.o)) {
                                o4Var.a().E().b(s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), "Too many conversions. Not logging as conversion. appId");
                                z5 = false;
                                d3Var = null;
                                int i28 = -1;
                                for (i10 = 0; i10 < a3Var3.j(); i10++) {
                                    com.google.android.gms.internal.measurement.e3 k3 = a3Var3.k(i10);
                                    if ("_c".equals(k3.q())) {
                                        d3Var = (com.google.android.gms.internal.measurement.d3) k3.i();
                                        i28 = i10;
                                    } else if ("_err".equals(k3.q())) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    if (d3Var != null) {
                                        a3Var3.o(i28);
                                    } else {
                                        d3Var = null;
                                    }
                                }
                                if (d3Var == null) {
                                    com.google.android.gms.internal.measurement.d3 d3Var4 = (com.google.android.gms.internal.measurement.d3) d3Var.clone();
                                    d3Var4.i("_err");
                                    d3Var4.k(10L);
                                    com.google.android.gms.internal.measurement.e3 e3Var4 = (com.google.android.gms.internal.measurement.e3) d3Var4.e();
                                    a3Var3.b();
                                    ((com.google.android.gms.internal.measurement.b3) a3Var3.s).A(i28, e3Var4);
                                } else {
                                    o4Var.a().D().b(s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), "Did not find conversion parameter. appId");
                                }
                            }
                            if (z2) {
                            }
                            if ("_e".equals(a3Var3.p())) {
                            }
                            if (a3Var3.j() != 0) {
                            }
                            i7 = i16;
                            ((ArrayList) b1Var.d).set(i7, (com.google.android.gms.internal.measurement.b3) a3Var3.e());
                            i3Var3.a0(a3Var3);
                            i15 = i + 1;
                        }
                        com.google.android.gms.internal.measurement.d3 B4 = com.google.android.gms.internal.measurement.e3.B();
                        i5 = i12;
                        B4.i("_ct");
                        if (!z6) {
                            String p4 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                            if (o4Var.R(p4, str9) && o4Var.R(p4, "_iap") && o4Var.R(p4, "ecommerce_purchase")) {
                                str3 = "new";
                                B4.j(str3);
                                a3Var3.l((com.google.android.gms.internal.measurement.e3) B4.e());
                                z6 = true;
                                if (a3Var3.p().equals(c2.g(str8, c2.c, c2.a))) {
                                }
                                P = o4Var.f0().P(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var3.p());
                                if (P) {
                                }
                                str5 = str8;
                                i9 = 0;
                                z3 = false;
                                z4 = false;
                                while (true) {
                                    str4 = str9;
                                    if (i9 >= a3Var3.j()) {
                                    }
                                    i9++;
                                    str9 = str4;
                                    i3Var3 = i3Var2;
                                }
                                i3Var = i3Var3;
                                if (!z3) {
                                    o4Var.a().G().b(o1Var.n().a(a3Var3.p()), "Marking event as conversion");
                                    com.google.android.gms.internal.measurement.d3 B22 = com.google.android.gms.internal.measurement.e3.B();
                                    B22.i("_c");
                                    B22.k(1L);
                                    a3Var3.n(B22);
                                }
                                if (!z4) {
                                }
                                if (o4Var.g0().D0(o4Var.g(), ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), false, true, false, false).e > o4Var.e0().H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.p)) {
                                }
                                if (t4.y0(a3Var3.p())) {
                                    o4Var.a().E().b(s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), "Too many conversions. Not logging as conversion. appId");
                                    z5 = false;
                                    d3Var = null;
                                    int i282 = -1;
                                    while (i10 < a3Var3.j()) {
                                    }
                                    if (z5) {
                                    }
                                    if (d3Var == null) {
                                    }
                                }
                                if (z2) {
                                }
                                if ("_e".equals(a3Var3.p())) {
                                }
                                if (a3Var3.j() != 0) {
                                }
                                i7 = i16;
                                ((ArrayList) b1Var.d).set(i7, (com.google.android.gms.internal.measurement.b3) a3Var3.e());
                                i3Var3.a0(a3Var3);
                                i15 = i + 1;
                            }
                        }
                        str3 = "returning";
                        B4.j(str3);
                        a3Var3.l((com.google.android.gms.internal.measurement.e3) B4.e());
                        z6 = true;
                        if (a3Var3.p().equals(c2.g(str8, c2.c, c2.a))) {
                        }
                        P = o4Var.f0().P(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var3.p());
                        if (P) {
                        }
                        str5 = str8;
                        i9 = 0;
                        z3 = false;
                        z4 = false;
                        while (true) {
                            str4 = str9;
                            if (i9 >= a3Var3.j()) {
                            }
                            i9++;
                            str9 = str4;
                            i3Var3 = i3Var2;
                        }
                        i3Var = i3Var3;
                        if (!z3) {
                        }
                        if (!z4) {
                        }
                        if (o4Var.g0().D0(o4Var.g(), ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), false, true, false, false).e > o4Var.e0().H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.p)) {
                        }
                        if (t4.y0(a3Var3.p())) {
                        }
                        if (z2) {
                        }
                        if ("_e".equals(a3Var3.p())) {
                        }
                        if (a3Var3.j() != 0) {
                        }
                        i7 = i16;
                        ((ArrayList) b1Var.d).set(i7, (com.google.android.gms.internal.measurement.b3) a3Var3.e());
                        i3Var3.a0(a3Var3);
                        i15 = i + 1;
                    }
                    i14 = i7 + 1;
                    str10 = str6;
                    l4 = l;
                    str7 = str2;
                    str8 = str5;
                    str9 = str4;
                }
                long j5 = 0;
                long j6 = 0;
                int i29 = i;
                int i30 = 0;
                while (i30 < i29) {
                    com.google.android.gms.internal.measurement.b3 T1 = ((com.google.android.gms.internal.measurement.j3) i3Var3.s).T1(i30);
                    if ("_e".equals(T1.s())) {
                        o4Var.j0();
                        if (w0.H(T1, "_fr") != null) {
                            i3Var3.b0(i30);
                            i29--;
                            i30--;
                            i30++;
                        }
                    }
                    o4Var.j0();
                    com.google.android.gms.internal.measurement.e3 H = w0.H(T1, "_et");
                    if (H != null) {
                        Long valueOf = H.t() ? Long.valueOf(H.u()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j6 += valueOf.longValue();
                        }
                    }
                    i30++;
                }
                o4Var.J(i3Var3, j6, false);
                Iterator it2 = i3Var3.X().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((com.google.android.gms.internal.measurement.b3) it2.next()).s())) {
                        o4Var.g0().r0(i3Var3.q(), "_se");
                        break;
                    }
                }
                if (w0.n0(i3Var3, "_sid") >= 0) {
                    o4Var.J(i3Var3, j6, true);
                } else {
                    int n0 = w0.n0(i3Var3, "_se");
                    if (n0 >= 0) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).e0(n0);
                        o4Var.a().D().b(s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String p5 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                o4Var.b().z();
                o4Var.l0();
                x0 B0 = o4Var.g0().B0(p5);
                if (B0 == null) {
                    o4Var.a().D().b(s0.H(p5), "Cannot fix consent fields without appInfo. appId");
                } else {
                    o4Var.m(B0, i3Var3);
                }
                String p6 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                o4Var.b().z();
                o4Var.l0();
                x0 B02 = o4Var.g0().B0(p6);
                if (B02 == null) {
                    o4Var.a().E().b(s0.H(p6), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    o4Var.n(B02, i3Var3);
                }
                i3Var3.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var3.s).h0(Long.MAX_VALUE);
                i3Var3.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var3.s).i0(Long.MIN_VALUE);
                for (int i32 = 0; i32 < i3Var3.Y(); i32++) {
                    com.google.android.gms.internal.measurement.b3 T12 = ((com.google.android.gms.internal.measurement.j3) i3Var3.s).T1(i32);
                    if (T12.u() < ((com.google.android.gms.internal.measurement.j3) i3Var3.s).a2()) {
                        long u = T12.u();
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).h0(u);
                    }
                    if (T12.u() > ((com.google.android.gms.internal.measurement.j3) i3Var3.s).c2()) {
                        long u2 = T12.u();
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).i0(u2);
                    }
                }
                i3Var3.P();
                b2 b2Var = b2.c;
                b2 j7 = o4Var.e(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()).j(b2.c(((com.google.android.gms.internal.measurement.j3) b1Var.b).u0(), 100));
                b2 e0 = o4Var.g0().e0(((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                o4Var.g0().d0(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), j7);
                a2 a2Var = a2.ANALYTICS_STORAGE;
                if (!j7.i(a2Var) && e0.i(a2Var)) {
                    o4Var.g0().p0(((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                } else if (j7.i(a2Var) && !e0.i(a2Var)) {
                    o4Var.g0().q0(((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                }
                a2 a2Var2 = a2.AD_STORAGE;
                if (!j7.i(a2Var2)) {
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).z1();
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).B1();
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).S0();
                }
                if (!j7.i(a2Var)) {
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).D1();
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).Z0();
                }
                m8.a();
                if (o4Var.e0().J(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.P0)) {
                    o4Var.k0();
                    if (t4.W(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()) && o4Var.e(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()).i(a2Var2) && ((com.google.android.gms.internal.measurement.j3) b1Var.b).z0()) {
                        o4Var.w(i3Var3, b1Var);
                    }
                }
                i3Var3.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var3.s).L1();
                i3Var3.M(o4Var.i0().D(i3Var3.q(), i3Var3.X(), Collections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var3.s).U1()), Long.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var3.s).a2()), Long.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var3.s).c2()), !j7.i(a2Var)));
                if (o4Var.e0().B(((com.google.android.gms.internal.measurement.j3) b1Var.b).p())) {
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom x0 = o4Var.k0().x0();
                    int i33 = 0;
                    while (i33 < i3Var3.Y()) {
                        com.google.android.gms.internal.measurement.a3 a3Var6 = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.j3) i3Var3.s).T1(i33).i();
                        if (a3Var6.p().equals("_ep")) {
                            o4Var.j0();
                            String str14 = (String) w0.I((com.google.android.gms.internal.measurement.b3) a3Var6.e(), "_en");
                            t tVar = (t) hashMap2.get(str14);
                            if (tVar == null) {
                                o g0 = o4Var.g0();
                                String p7 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                                c21.u.g(str14);
                                tVar = g0.X("events", p7, str14);
                                if (tVar != null) {
                                    hashMap2.put(str14, tVar);
                                }
                            }
                            if (tVar == null || tVar.i != null) {
                                l2 = l;
                            } else {
                                Long l5 = tVar.j;
                                if (l5 != null && l5.longValue() > 1) {
                                    o4Var.j0();
                                    w0.F(a3Var6, "_sr", l5);
                                }
                                Boolean bool = tVar.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    o4Var.j0();
                                    l2 = l;
                                    w0.F(a3Var6, "_efs", l2);
                                }
                                arrayList5.add((com.google.android.gms.internal.measurement.b3) a3Var6.e());
                            }
                            i3Var3.Z(i33, a3Var6);
                            j3 = j5;
                        } else {
                            l2 = l;
                            i1 f0 = o4Var.f0();
                            j3 = j5;
                            String p8 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                            String e = f0.e(p8, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(e)) {
                                try {
                                    parseLong = Long.parseLong(e);
                                } catch (NumberFormatException e2) {
                                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) f0).s).a().E().c("Unable to parse timezone offset. appId", s0.H(p8), e2);
                                }
                                o4Var.k0();
                                long j8 = parseLong * 60000;
                                long q = (a3Var6.q() + j8) / 86400000;
                                com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) a3Var6.e();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    for (com.google.android.gms.internal.measurement.e3 e3Var5 : b3Var.p()) {
                                        j4 = j8;
                                        if (!"_dbg".equals(e3Var5.q())) {
                                            j8 = j4;
                                        } else if (l2.equals(Long.valueOf(e3Var5.u()))) {
                                            i4 = 1;
                                            if (i4 > 0) {
                                            }
                                        } else {
                                            i4 = f0().Q(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var6.p());
                                            if (i4 > 0) {
                                                a().E().c("Sample rate must be positive. event, rate", a3Var6.p(), Integer.valueOf(i4));
                                                arrayList5.add((com.google.android.gms.internal.measurement.b3) a3Var6.e());
                                                i3Var3.Z(i33, a3Var6);
                                            } else {
                                                t tVar2 = (t) hashMap2.get(a3Var6.p());
                                                if (tVar2 == null && (tVar2 = g0().X("events", ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var6.p())) == null) {
                                                    a().E().c("Event being bundled has no eventAggregate. appId, eventName", ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var6.p());
                                                    tVar2 = new t(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var6.p(), 1L, 1L, 1L, a3Var6.q(), 0L, null, null, null, null);
                                                }
                                                j0();
                                                Long l6 = (Long) w0.I((com.google.android.gms.internal.measurement.b3) a3Var6.e(), "_eid");
                                                boolean z9 = l6 != null;
                                                if (i4 == 1) {
                                                    arrayList5.add((com.google.android.gms.internal.measurement.b3) a3Var6.e());
                                                    if (z9 && (tVar2.i != null || tVar2.j != null || tVar2.k != null)) {
                                                        hashMap2.put(a3Var6.p(), tVar2.b(null, null, null));
                                                    }
                                                    i3Var3.Z(i33, a3Var6);
                                                } else {
                                                    if (x0.nextInt(i4) == 0) {
                                                        j0();
                                                        HashMap hashMap3 = hashMap2;
                                                        Long valueOf2 = Long.valueOf(i4);
                                                        w0.F(a3Var6, "_sr", valueOf2);
                                                        arrayList5.add((com.google.android.gms.internal.measurement.b3) a3Var6.e());
                                                        if (z9) {
                                                            tVar2 = tVar2.b(null, valueOf2, null);
                                                        }
                                                        hashMap = hashMap3;
                                                        hashMap.put(a3Var6.p(), new t(tVar2.a, tVar2.b, tVar2.c, tVar2.d, tVar2.e, tVar2.f, a3Var6.q(), Long.valueOf(q), tVar2.i, tVar2.j, tVar2.k));
                                                        l3 = l2;
                                                    } else {
                                                        hashMap = hashMap2;
                                                        Long l7 = tVar2.h;
                                                        if (l7 != null) {
                                                            r = l7.longValue();
                                                        } else {
                                                            k0();
                                                            r = (j4 + a3Var6.r()) / 86400000;
                                                        }
                                                        if (r != q) {
                                                            j0();
                                                            w0.F(a3Var6, "_efs", l2);
                                                            j0();
                                                            l3 = l2;
                                                            Long valueOf3 = Long.valueOf(i4);
                                                            w0.F(a3Var6, "_sr", valueOf3);
                                                            arrayList5.add((com.google.android.gms.internal.measurement.b3) a3Var6.e());
                                                            if (z9) {
                                                                tVar2 = tVar2.b(null, valueOf3, Boolean.TRUE);
                                                            }
                                                            hashMap.put(a3Var6.p(), new t(tVar2.a, tVar2.b, tVar2.c, tVar2.d, tVar2.e, tVar2.f, a3Var6.q(), Long.valueOf(q), tVar2.i, tVar2.j, tVar2.k));
                                                        } else {
                                                            l3 = l2;
                                                            if (z9) {
                                                                hashMap.put(a3Var6.p(), tVar2.b(l6, null, null));
                                                            }
                                                        }
                                                    }
                                                    i3Var3.Z(i33, a3Var6);
                                                    i33++;
                                                    o4Var = this;
                                                    l = l3;
                                                    hashMap2 = hashMap;
                                                    j5 = j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j4 = j8;
                                i4 = f0().Q(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var6.p());
                                if (i4 > 0) {
                                }
                            }
                            parseLong = j3;
                            o4Var.k0();
                            long j82 = parseLong * 60000;
                            long q2 = (a3Var6.q() + j82) / 86400000;
                            com.google.android.gms.internal.measurement.b3 b3Var2 = (com.google.android.gms.internal.measurement.b3) a3Var6.e();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            j4 = j82;
                            i4 = f0().Q(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a3Var6.p());
                            if (i4 > 0) {
                            }
                        }
                        hashMap = hashMap2;
                        l3 = l2;
                        i33++;
                        o4Var = this;
                        l = l3;
                        hashMap2 = hashMap;
                        j5 = j3;
                    }
                    j2 = j5;
                    HashMap hashMap4 = hashMap2;
                    if (arrayList5.size() < i3Var3.Y()) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).a0();
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).Z(arrayList5);
                    }
                    Iterator it3 = hashMap4.entrySet().iterator();
                    while (it3.hasNext()) {
                        g0().Y("events", (t) ((Map.Entry) it3.next()).getValue());
                    }
                } else {
                    j2 = 0;
                }
                String p9 = ((com.google.android.gms.internal.measurement.j3) b1Var.b).p();
                x0 B03 = g0().B0(p9);
                if (B03 == null) {
                    a().D().b(s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), "Bundling raw events w/o app info. appId");
                } else if (i3Var3.Y() > 0) {
                    m1 m1Var = B03.a.x;
                    o1.m(m1Var);
                    m1Var.z();
                    long j9 = B03.i;
                    if (j9 != j2) {
                        i3Var3.i(j9);
                    } else {
                        i3Var3.j();
                    }
                    m1 m1Var2 = B03.a.x;
                    o1.m(m1Var2);
                    m1Var2.z();
                    long j10 = B03.h;
                    if (j10 != j2) {
                        j9 = j10;
                    }
                    if (j9 != j2) {
                        i3Var3.e0(j9);
                    } else {
                        i3Var3.f0();
                    }
                    B03.h(i3Var3.Y());
                    m1 m1Var3 = B03.a.x;
                    o1.m(m1Var3);
                    m1Var3.z();
                    int i34 = (int) B03.F;
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).j1(i34);
                    m1 m1Var4 = B03.a.x;
                    o1.m(m1Var4);
                    m1Var4.z();
                    i3Var3.A((int) B03.g);
                    B03.L(((com.google.android.gms.internal.measurement.j3) i3Var3.s).a2());
                    B03.M(((com.google.android.gms.internal.measurement.j3) i3Var3.s).c2());
                    String u3 = B03.u();
                    if (u3 != null) {
                        i3Var3.I(u3);
                    } else {
                        i3Var3.J();
                    }
                    i2 = 0;
                    g0().C0(B03, false);
                    if (i3Var3.Y() > 0) {
                        o1Var.getClass();
                        com.google.android.gms.internal.measurement.f2 L = f0().L(((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                        if (L != null && L.p()) {
                            long q3 = L.q();
                            i3Var3.b();
                            ((com.google.android.gms.internal.measurement.j3) i3Var3.s).Q0(q3);
                            g0().G0((com.google.android.gms.internal.measurement.j3) i3Var3.e(), z7);
                        }
                        if (((com.google.android.gms.internal.measurement.j3) b1Var.b).E().isEmpty()) {
                            i3Var3.b();
                            ((com.google.android.gms.internal.measurement.j3) i3Var3.s).Q0(-1L);
                        } else {
                            a().E().b(s0.H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p()), "Did not find measurement config or missing version info. appId");
                        }
                        g0().G0((com.google.android.gms.internal.measurement.j3) i3Var3.e(), z7);
                    }
                    o g02 = g0();
                    arrayList = (ArrayList) b1Var.c;
                    c21.u.g(arrayList);
                    g02.z();
                    g02.A();
                    StringBuilder sb = new StringBuilder("rowid in (");
                    for (i3 = i2; i3 < arrayList.size(); i3++) {
                        if (i3 != 0) {
                            sb.append(",");
                        }
                        sb.append(((Long) arrayList.get(i3)).longValue());
                    }
                    sb.append(")");
                    delete = g02.o0().delete("raw_events", sb.toString(), null);
                    if (delete != arrayList.size()) {
                        ((o1) ((androidx.compose.foundation.lazy.layout.s0) g02).s).a().D().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(arrayList.size()));
                    }
                    o g03 = g0();
                    g03.o0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{p9, p9});
                    g0().m0();
                    z = true;
                }
                i2 = 0;
                if (i3Var3.Y() > 0) {
                }
                o g022 = g0();
                arrayList = (ArrayList) b1Var.c;
                c21.u.g(arrayList);
                g022.z();
                g022.A();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                while (i3 < arrayList.size()) {
                }
                sb2.append(")");
                delete = g022.o0().delete("raw_events", sb2.toString(), null);
                if (delete != arrayList.size()) {
                }
                o g032 = g0();
                g032.o0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{p9, p9});
                g0().m0();
                z = true;
            }
            g0().n0();
            return z;
        } catch (Throwable th) {
            g0().n0();
            throw th;
        }
    }

    public final void J(com.google.android.gms.internal.measurement.i3 i3Var, long j, boolean z) {
        r4 r4Var;
        Object obj;
        String str = true != z ? "_lte" : "_se";
        o oVar = this.t;
        U(oVar);
        r4 t0 = oVar.t0(i3Var.q(), str);
        if (t0 == null || (obj = t0.e) == null) {
            String q = i3Var.q();
            f().getClass();
            r4Var = new r4(q, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String q2 = i3Var.q();
            f().getClass();
            r4Var = new r4(q2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.google.android.gms.internal.measurement.r3 A = com.google.android.gms.internal.measurement.s3.A();
        A.b();
        ((com.google.android.gms.internal.measurement.s3) A.s).C(str);
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        A.b();
        ((com.google.android.gms.internal.measurement.s3) A.s).B(currentTimeMillis);
        Object obj2 = r4Var.e;
        long longValue = ((Long) obj2).longValue();
        A.b();
        ((com.google.android.gms.internal.measurement.s3) A.s).F(longValue);
        com.google.android.gms.internal.measurement.s3 s3Var = (com.google.android.gms.internal.measurement.s3) A.e();
        int n0 = w0.n0(i3Var, str);
        if (n0 >= 0) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).c0(n0, s3Var);
        } else {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).d0(s3Var);
        }
        if (j > 0) {
            o oVar2 = this.t;
            U(oVar2);
            oVar2.s0(r4Var);
            a().F.c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final boolean K(com.google.android.gms.internal.measurement.a3 a3Var, com.google.android.gms.internal.measurement.a3 a3Var2) {
        c21.u.b("_e".equals(a3Var.p()));
        j0();
        com.google.android.gms.internal.measurement.e3 H = w0.H((com.google.android.gms.internal.measurement.b3) a3Var.e(), "_sc");
        String s = H == null ? null : H.s();
        j0();
        com.google.android.gms.internal.measurement.e3 H2 = w0.H((com.google.android.gms.internal.measurement.b3) a3Var2.e(), "_pc");
        String s2 = H2 != null ? H2.s() : null;
        if (s2 == null || !s2.equals(s)) {
            return false;
        }
        c21.u.b("_e".equals(a3Var.p()));
        j0();
        com.google.android.gms.internal.measurement.e3 H3 = w0.H((com.google.android.gms.internal.measurement.b3) a3Var.e(), "_et");
        if (H3 == null || !H3.t() || H3.u() <= 0) {
            return true;
        }
        long u = H3.u();
        j0();
        com.google.android.gms.internal.measurement.e3 H4 = w0.H((com.google.android.gms.internal.measurement.b3) a3Var2.e(), "_et");
        if (H4 != null && H4.u() > 0) {
            u += H4.u();
        }
        j0();
        w0.F(a3Var2, "_et", Long.valueOf(u));
        j0();
        w0.F(a3Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        b().z();
        l0();
        o oVar = this.t;
        U(oVar);
        if (oVar.j0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        o oVar2 = this.t;
        U(oVar2);
        return !TextUtils.isEmpty(oVar2.H());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        boolean z;
        long max;
        long max2;
        long j;
        int i;
        Integer num;
        int intValue;
        w0 w0Var = this.x;
        b().z();
        l0();
        if (this.F > 0) {
            f().getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.F);
            if (abs > 0) {
                a().F.b(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                h0().b();
                d4 d4Var = this.v;
                U(d4Var);
                d4Var.D();
                return;
            }
            this.F = 0L;
        }
        if (!this.C.h() || !L()) {
            a().F.a("Nothing to upload or uploading impossible");
            h0().b();
            d4 d4Var2 = this.v;
            U(d4Var2);
            d4Var2.D();
            return;
        }
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        e0();
        long max3 = Math.max(0L, ((Long) c0.O.a(null)).longValue());
        o oVar = this.t;
        U(oVar);
        if (oVar.j0("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            o oVar2 = this.t;
            U(oVar2);
            if (oVar2.j0("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z = false;
                if (z) {
                    e0();
                    max = Math.max(0L, ((Long) c0.H.a(null)).longValue());
                } else {
                    String D = e0().D("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(D) || ".none.".equals(D)) {
                        e0();
                        max = Math.max(0L, ((Long) c0.I.a(null)).longValue());
                    } else {
                        e0();
                        max = Math.max(0L, ((Long) c0.J.a(null)).longValue());
                    }
                }
                long a = this.z.z.a();
                long a2 = this.z.A.a();
                o oVar3 = this.t;
                U(oVar3);
                long k0 = oVar3.k0("select max(bundle_end_timestamp) from queue", null, 0L);
                o oVar4 = this.t;
                U(oVar4);
                max2 = Math.max(k0, oVar4.k0("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    j = 0;
                } else {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = currentTimeMillis - Math.abs(a - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                    long j2 = max3 + abs2;
                    long max4 = Math.max(abs3, abs4);
                    if (z && max4 > 0) {
                        j2 = Math.min(abs2, max4) + max;
                    }
                    U(w0Var);
                    j = !w0Var.j0(max4, max) ? max4 + max : j2;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i2 = 0;
                        while (true) {
                            e0();
                            i = 0;
                            if (i2 >= Math.min(20, Math.max(0, ((Integer) c0.Q.a(null)).intValue()))) {
                                j = 0;
                                break;
                            }
                            e0();
                            j += Math.max(0L, ((Long) c0.P.a(null)).longValue()) * (1 << i2);
                            if (j > abs4) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (j == 0) {
                            a().F.a("Next upload time is 0");
                            h0().b();
                            d4 d4Var3 = this.v;
                            U(d4Var3);
                            d4Var3.D();
                            return;
                        }
                        w0 w0Var2 = this.s;
                        U(w0Var2);
                        if (!w0Var2.T()) {
                            a().F.a("No network");
                            y0 h0 = h0();
                            o4 o4Var = (o4) h0.d;
                            o4Var.l0();
                            o4Var.b().z();
                            if (!h0.b) {
                                o4Var.C.r.registerReceiver(h0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                w0 w0Var3 = o4Var.s;
                                U(w0Var3);
                                h0.c = w0Var3.T();
                                o4Var.a().F.b(Boolean.valueOf(h0.c), "Registering connectivity change receiver. Network connected");
                                h0.b = true;
                            }
                            d4 d4Var4 = this.v;
                            U(d4Var4);
                            d4Var4.D();
                            return;
                        }
                        long a3 = this.z.y.a();
                        e0();
                        long max5 = Math.max(0L, ((Long) c0.G.a(null)).longValue());
                        U(w0Var);
                        if (!w0Var.j0(a3, max5)) {
                            j = Math.max(j, a3 + max5);
                        }
                        h0().b();
                        f().getClass();
                        long currentTimeMillis2 = j - System.currentTimeMillis();
                        if (currentTimeMillis2 <= 0) {
                            e0();
                            currentTimeMillis2 = Math.max(0L, ((Long) c0.K.a(null)).longValue());
                            a1 a1Var = this.z.z;
                            f().getClass();
                            a1Var.b(System.currentTimeMillis());
                        }
                        a().F.b(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                        d4 d4Var5 = this.v;
                        U(d4Var5);
                        d4Var5.A();
                        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) d4Var5).s;
                        o1Var.getClass();
                        s0 s0Var = o1Var.w;
                        Context context = o1Var.r;
                        if (!t4.q0(context)) {
                            o1.m(s0Var);
                            s0Var.E.a("Receiver not registered/enabled");
                        }
                        if (!t4.S(context)) {
                            o1.m(s0Var);
                            s0Var.E.a("Service not registered/enabled");
                        }
                        d4Var5.D();
                        o1.m(s0Var);
                        s0Var.F.b(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                        o1Var.B.getClass();
                        SystemClock.elapsedRealtime();
                        if (currentTimeMillis2 < Math.max(0L, ((Long) c0.L.a(null)).longValue()) && d4Var5.E().c == 0) {
                            d4Var5.E().b(currentTimeMillis2);
                        }
                        ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                        int G = d4Var5.G();
                        PersistableBundle persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                        JobInfo build = new JobInfo.Builder(G, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                        Method method = com.google.android.gms.internal.measurement.g0.a;
                        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                        jobScheduler.getClass();
                        Method method2 = com.google.android.gms.internal.measurement.g0.a;
                        if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                            jobScheduler.schedule(build);
                            return;
                        }
                        Method method3 = com.google.android.gms.internal.measurement.g0.b;
                        try {
                            if (method3 != null) {
                                try {
                                    num = (Integer) method3.invoke(UserHandle.class, null);
                                } catch (IllegalAccessException | InvocationTargetException unused) {
                                    Log.isLoggable("JobSchedulerCompat", 6);
                                }
                                if (num != null) {
                                    intValue = num.intValue();
                                    return;
                                }
                            }
                            return;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            jobScheduler.schedule(build);
                            return;
                        }
                        intValue = i;
                    }
                }
                i = 0;
                if (j == 0) {
                }
            }
        }
        z = true;
        if (z) {
        }
        long a4 = this.z.z.a();
        long a22 = this.z.A.a();
        o oVar32 = this.t;
        U(oVar32);
        long k02 = oVar32.k0("select max(bundle_end_timestamp) from queue", null, 0L);
        o oVar42 = this.t;
        U(oVar42);
        max2 = Math.max(k02, oVar42.k0("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        i = 0;
        if (j == 0) {
        }
    }

    public final void O() {
        b().z();
        if (this.K || this.L || this.M) {
            a().F.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.K), Boolean.valueOf(this.L), Boolean.valueOf(this.M));
            return;
        }
        a().F.a("Stopping uploading service(s)");
        ArrayList arrayList = this.G;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.G;
        c21.u.g(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(x0 x0Var) {
        try {
            long P = x0Var.P();
            o1 o1Var = this.C;
            if (P != -2147483648L) {
                if (x0Var.P() == i21.b.a(o1Var.r).f(x0Var.D(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = i21.b.a(o1Var.r).f(x0Var.D(), 0).versionName;
                String N = x0Var.N();
                if (N != null && N.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final v4 Q(String str) {
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str);
        if (B0 != null) {
            o1 o1Var = B0.a;
            if (!TextUtils.isEmpty(B0.N())) {
                Boolean P = P(B0);
                if (P != null && !P.booleanValue()) {
                    a().x.b(s0.H(str), "App version does not match; dropping. appId");
                    return null;
                }
                String G = B0.G();
                String N = B0.N();
                long P2 = B0.P();
                m1 m1Var = o1Var.x;
                o1.m(m1Var);
                m1Var.z();
                String str2 = B0.l;
                m1 m1Var2 = o1Var.x;
                o1.m(m1Var2);
                m1Var2.z();
                long j = B0.m;
                m1 m1Var3 = o1Var.x;
                o1.m(m1Var3);
                m1Var3.z();
                long j2 = B0.n;
                m1 m1Var4 = o1Var.x;
                o1.m(m1Var4);
                m1Var4.z();
                boolean z = B0.o;
                String J = B0.J();
                m1 m1Var5 = o1Var.x;
                o1.m(m1Var5);
                m1Var5.z();
                boolean z2 = B0.p;
                Boolean w = B0.w();
                long b = B0.b();
                m1 m1Var6 = o1Var.x;
                o1.m(m1Var6);
                m1Var6.z();
                ArrayList arrayList = B0.s;
                String g = e(str).g();
                boolean y = B0.y();
                m1 m1Var7 = o1Var.x;
                o1.m(m1Var7);
                m1Var7.z();
                long j3 = B0.v;
                int i = e(str).b;
                String str3 = o0(str).b;
                m1 m1Var8 = o1Var.x;
                o1.m(m1Var8);
                m1Var8.z();
                int i2 = B0.x;
                m1 m1Var9 = o1Var.x;
                o1.m(m1Var9);
                m1Var9.z();
                return new v4(str, G, N, P2, str2, j, j2, (String) null, z, false, J, 0L, 0, z2, false, w, b, (List) arrayList, g, "", (String) null, y, j3, i, str3, i2, B0.B, B0.C(), B0.s(), 0L, B0.t());
            }
        }
        a().E.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        o oVar = this.t;
        U(oVar);
        t X = oVar.X("events", str, str2);
        return X == null || X.c < 1;
    }

    public final void W(q4 q4Var, v4 v4Var) {
        String str;
        long j;
        b().z();
        l0();
        boolean T = T(v4Var);
        String str2 = v4Var.r;
        if (T) {
            if (!v4Var.y) {
                c0(v4Var);
                return;
            }
            t4 k0 = k0();
            String str3 = q4Var.s;
            int F0 = k0.F0(str3);
            l4 l4Var = this.a0;
            if (F0 != 0) {
                k0();
                e0();
                String E = t4.E(24, str3, true);
                int length = str3 != null ? str3.length() : 0;
                k0();
                t4.P(l4Var, v4Var.r, F0, "_ev", E, length);
                return;
            }
            int M = k0().M(q4Var.j(), str3);
            if (M != 0) {
                k0();
                e0();
                String E2 = t4.E(24, str3, true);
                Object j2 = q4Var.j();
                int length2 = (j2 == null || !((j2 instanceof String) || (j2 instanceof CharSequence))) ? 0 : j2.toString().length();
                k0();
                t4.P(l4Var, v4Var.r, M, "_ev", E2, length2);
                return;
            }
            Object N = k0().N(q4Var.j(), str3);
            if (N != null) {
                if ("_sid".equals(str3)) {
                    long j3 = q4Var.t;
                    String str4 = q4Var.w;
                    c21.u.g(str2);
                    o oVar = this.t;
                    U(oVar);
                    r4 t0 = oVar.t0(str2, "_sno");
                    if (t0 != null) {
                        Object obj = t0.e;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            W(new q4(j3, Long.valueOf(j + 1), "_sno", str4), v4Var);
                        }
                    }
                    if (t0 != null) {
                        a().A.b(t0.e, "Retrieved last session number from database does not contain a valid (long) value");
                    }
                    o oVar2 = this.t;
                    U(oVar2);
                    t X = oVar2.X("events", str2, "_s");
                    if (X != null) {
                        q0 q0Var = a().F;
                        str = "_sid";
                        long j4 = X.c;
                        q0Var.b(Long.valueOf(j4), "Backfill the session number. Last used session number");
                        j = j4;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    W(new q4(j3, Long.valueOf(j + 1), "_sno", str4), v4Var);
                } else {
                    str = "_sid";
                }
                c21.u.g(str2);
                String str5 = q4Var.w;
                c21.u.g(str5);
                r4 r4Var = new r4(str2, str5, str3, q4Var.t, N);
                q0 q0Var2 = a().F;
                o1 o1Var = this.C;
                n0 n0Var = o1Var.A;
                String str6 = r4Var.c;
                q0Var2.c("Setting user property", n0Var.c(str6), N);
                o oVar3 = this.t;
                U(oVar3);
                oVar3.l0();
                try {
                    boolean equals = "_id".equals(str6);
                    Object obj2 = r4Var.e;
                    if (equals) {
                        o oVar4 = this.t;
                        U(oVar4);
                        r4 t02 = oVar4.t0(str2, "_id");
                        if (t02 != null && !obj2.equals(t02.e)) {
                            o oVar5 = this.t;
                            U(oVar5);
                            oVar5.r0(str2, "_lair");
                        }
                    }
                    c0(v4Var);
                    o oVar6 = this.t;
                    U(oVar6);
                    boolean s0 = oVar6.s0(r4Var);
                    if (str.equals(str3)) {
                        w0 w0Var = this.x;
                        U(w0Var);
                        String str7 = v4Var.L;
                        long k02 = TextUtils.isEmpty(str7) ? 0L : w0Var.k0(str7.getBytes(Charset.forName("UTF-8")));
                        o oVar7 = this.t;
                        U(oVar7);
                        x0 B0 = oVar7.B0(str2);
                        if (B0 != null) {
                            B0.A(k02);
                            if (B0.o()) {
                                o oVar8 = this.t;
                                U(oVar8);
                                oVar8.C0(B0, false);
                            }
                        }
                    }
                    o oVar9 = this.t;
                    U(oVar9);
                    oVar9.m0();
                    if (!s0) {
                        a().x.c("Too many unique user properties are set. Ignoring user property", o1Var.A.c(str6), obj2);
                        k0();
                        t4.P(l4Var, str2, 9, null, null, 0);
                    }
                    o oVar10 = this.t;
                    U(oVar10);
                    oVar10.n0();
                } catch (Throwable th) {
                    o oVar11 = this.t;
                    U(oVar11);
                    oVar11.n0();
                    throw th;
                }
            }
        }
    }

    public final void X(String str, v4 v4Var) {
        b().z();
        l0();
        boolean T = T(v4Var);
        String str2 = v4Var.r;
        if (T) {
            if (!v4Var.y) {
                c0(v4Var);
                return;
            }
            Boolean V = V(v4Var);
            if ("_npa".equals(str) && V != null) {
                a().E.a("Falling back to manifest metadata value for ad personalization");
                f().getClass();
                W(new q4(System.currentTimeMillis(), Long.valueOf(true != V.booleanValue() ? 0L : 1L), "_npa", "auto"), v4Var);
                return;
            }
            q0 q0Var = a().E;
            o1 o1Var = this.C;
            q0Var.b(o1Var.A.c(str), "Removing user property");
            o oVar = this.t;
            U(oVar);
            oVar.l0();
            try {
                c0(v4Var);
                if ("_id".equals(str)) {
                    o oVar2 = this.t;
                    U(oVar2);
                    c21.u.g(str2);
                    oVar2.r0(str2, "_lair");
                }
                o oVar3 = this.t;
                U(oVar3);
                c21.u.g(str2);
                oVar3.r0(str2, str);
                o oVar4 = this.t;
                U(oVar4);
                oVar4.m0();
                a().E.b(o1Var.A.c(str), "User property removed");
                o oVar5 = this.t;
                U(oVar5);
                oVar5.n0();
            } catch (Throwable th) {
                o oVar6 = this.t;
                U(oVar6);
                oVar6.n0();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:76|77|78|(2:80|(8:82|(3:84|(2:86|(1:88))(1:108)|107)(1:109)|89|(1:91)(1:106)|92|93|94|(4:96|(1:98)(1:102)|99|(1:101))))|110|93|94|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x034c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x034d, code lost:
    
        r2.a().x.c("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.s0.H(r3), r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0422 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x012c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0114 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:25:0x00a4, B:27:0x00b4, B:31:0x00cc, B:34:0x00dc, B:36:0x00eb, B:38:0x0100, B:40:0x010d, B:41:0x0118, B:44:0x011f, B:47:0x013a, B:50:0x0153, B:124:0x019b, B:167:0x012c, B:168:0x0114, B:169:0x00f5, B:173:0x00fd), top: B:24:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028f A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:120:0x0177, B:122:0x0185, B:55:0x0264, B:57:0x028f, B:58:0x0292, B:128:0x01ad, B:130:0x01d5, B:131:0x01e6, B:133:0x01ed, B:135:0x01f3, B:137:0x01fd, B:139:0x0203, B:141:0x0209, B:143:0x020f, B:145:0x0214, B:148:0x022d, B:153:0x0231, B:154:0x0242, B:155:0x024d, B:54:0x0258), top: B:119:0x0177, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b5 A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037e A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038e A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035f A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:60:0x0297, B:62:0x02b5, B:67:0x037e, B:68:0x0381, B:70:0x038e, B:71:0x039e, B:72:0x0446, B:77:0x02cd, B:80:0x02ed, B:82:0x02f5, B:84:0x02fc, B:88:0x030f, B:89:0x0321, B:92:0x032d, B:94:0x0340, B:96:0x035f, B:98:0x0367, B:99:0x036f, B:101:0x0375, B:105:0x034d, B:108:0x031a, B:113:0x02db, B:156:0x03b7, B:158:0x03ec, B:159:0x03ef, B:161:0x03fc, B:162:0x040a, B:163:0x0422, B:165:0x042a), top: B:45:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.v4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.measurement.internal.o4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.o4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(v4 v4Var) {
        r4 t0;
        Boolean V;
        long j;
        long j2;
        int i;
        t X;
        boolean z;
        String str;
        o1 o1Var;
        String str2;
        long N;
        o1 o1Var2;
        PackageInfo packageInfo;
        v4 v4Var2;
        ApplicationInfo applicationInfo;
        long j3;
        boolean z2;
        o4 o4Var = v4Var;
        o1 o1Var3 = this.C;
        b().z();
        l0();
        c21.u.g(o4Var);
        boolean z3 = o4Var.F;
        String str3 = o4Var.r;
        c21.u.d(str3);
        if (!T(o4Var)) {
            return;
        }
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str3);
        if (B0 != null && TextUtils.isEmpty(B0.G()) && !TextUtils.isEmpty(o4Var.s)) {
            B0.f(0L);
            o oVar2 = this.t;
            U(oVar2);
            oVar2.C0(B0, false);
            i1 i1Var = this.r;
            U(i1Var);
            i1Var.z();
            i1Var.z.remove(str3);
        }
        if (!o4Var.y) {
            c0(v4Var);
            return;
        }
        long j4 = o4Var.C;
        if (j4 == 0) {
            f().getClass();
            j4 = System.currentTimeMillis();
        }
        long j5 = j4;
        int i2 = o4Var.D;
        if (i2 != 0 && i2 != 1) {
            a().A.c("Incorrect app type, assuming installed app. appId, appType", s0.H(str3), Integer.valueOf(i2));
            i2 = 0;
        }
        o oVar3 = this.t;
        U(oVar3);
        oVar3.l0();
        try {
            o oVar4 = this.t;
            U(oVar4);
            t0 = oVar4.t0(str3, "_npa");
            V = V(o4Var);
        } catch (Throwable th) {
            th = th;
            o4Var = this;
        }
        try {
            if (t0 != null) {
                j = 1;
                if (!"auto".equals(t0.b)) {
                    j2 = j5;
                    if (e0().J(null, c0.b1)) {
                        i = i2;
                        b0(o4Var, j2);
                    } else {
                        i = i2;
                        b0(o4Var, o4Var.U);
                    }
                    c0(v4Var);
                    if (i != 0) {
                        o oVar5 = this.t;
                        U(oVar5);
                        X = oVar5.X("events", str3, "_f");
                        z = false;
                    } else {
                        o oVar6 = this.t;
                        U(oVar6);
                        X = oVar6.X("events", str3, "_v");
                        z = true;
                    }
                    if (X != null) {
                        long j6 = ((j2 / 3600000) + j) * 3600000;
                        if (z) {
                            o4 o4Var2 = this;
                            Long valueOf = Long.valueOf(j6);
                            long j7 = j2;
                            o4Var2.W(new q4(j7, valueOf, "_fvt", "auto"), o4Var);
                            o4Var2.b().z();
                            o4Var2.l0();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z3) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (o4Var2.e0().J(null, c0.j1)) {
                                o4Var2.f().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            o4Var2.i(new w("_v", new v(bundle), "auto", j7), o4Var);
                            o4Var = o4Var2;
                        } else {
                            Long valueOf2 = Long.valueOf(j6);
                            long j8 = j2;
                            W(new q4(j8, valueOf2, "_fot", "auto"), o4Var);
                            b().z();
                            e1 e1Var = this.B;
                            c21.u.g(e1Var);
                            o1 o1Var4 = e1Var.s;
                            if (str3 != null) {
                                try {
                                    if (!str3.isEmpty()) {
                                        str = "_elt";
                                        m1 m1Var = o1Var4.x;
                                        Context context = o1Var4.r;
                                        s0 s0Var = o1Var4.w;
                                        o1.m(m1Var);
                                        m1Var.z();
                                        if (e1Var.a()) {
                                            o1Var = o1Var3;
                                            d1 d1Var = new d1(e1Var, str3);
                                            m1 m1Var2 = o1Var4.x;
                                            o1.m(m1Var2);
                                            m1Var2.z();
                                            str2 = str3;
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                o1.m(s0Var);
                                                s0Var.B.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                    o1.m(s0Var);
                                                    s0Var.D.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str4 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str4) && e1Var.a()) {
                                                            try {
                                                                boolean a = f21.a.b().a(context, new Intent(intent), d1Var, 1);
                                                                o1.m(s0Var);
                                                                s0Var.F.b(a ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e) {
                                                                s0 s0Var2 = o1Var4.w;
                                                                o1.m(s0Var2);
                                                                s0Var2.x.b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            o1.m(s0Var);
                                                            s0Var.A.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            o1.m(s0Var);
                                            s0Var.D.a("Install Referrer Reporter is not available");
                                            o1Var = o1Var3;
                                            str2 = str3;
                                        }
                                        b().z();
                                        l0();
                                        Bundle bundle2 = new Bundle();
                                        long j9 = j;
                                        bundle2.putLong("_c", j9);
                                        bundle2.putLong("_r", j9);
                                        bundle2.putLong("_uwa", 0L);
                                        bundle2.putLong("_pfo", 0L);
                                        bundle2.putLong("_sys", 0L);
                                        bundle2.putLong("_sysu", 0L);
                                        bundle2.putLong("_et", j9);
                                        if (z3) {
                                            bundle2.putLong("_dac", j9);
                                        }
                                        c21.u.g(str2);
                                        o4Var = this;
                                        o oVar7 = o4Var.t;
                                        U(oVar7);
                                        c21.u.d(str2);
                                        oVar7.z();
                                        oVar7.A();
                                        String str5 = str2;
                                        N = oVar7.N(str5);
                                        o1Var2 = o1Var;
                                        if (o1Var2.r.getPackageManager() != null) {
                                            o4Var.a().x.b(s0.H(str5), "PackageManager is null, first open report might be inaccurate. appId");
                                            v4Var2 = v4Var;
                                        } else {
                                            try {
                                                packageInfo = i21.b.a(o1Var2.r).f(str5, 0);
                                            } catch (PackageManager.NameNotFoundException e2) {
                                                o4Var.a().x.c("Package info is null, first open report might be inaccurate. appId", s0.H(str5), e2);
                                                packageInfo = null;
                                            }
                                            if (packageInfo != null) {
                                                long j10 = packageInfo.firstInstallTime;
                                                if (j10 != 0) {
                                                    if (j10 != packageInfo.lastUpdateTime) {
                                                        if (!o4Var.e0().J(null, c0.I0)) {
                                                            bundle2.putLong("_uwa", 1L);
                                                        } else if (N == 0) {
                                                            bundle2.putLong("_uwa", 1L);
                                                            z2 = false;
                                                            N = 0;
                                                        }
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    v4Var2 = v4Var;
                                                    o4Var.W(new q4(j8, Long.valueOf(true != z2 ? 0L : 1L), "_fi", "auto"), v4Var2);
                                                    applicationInfo = i21.b.a(o1Var2.r).d(str5, 0);
                                                    if (applicationInfo != null) {
                                                        if ((applicationInfo.flags & 1) != 0) {
                                                            j3 = 1;
                                                            bundle2.putLong("_sys", 1L);
                                                        } else {
                                                            j3 = 1;
                                                        }
                                                        if ((applicationInfo.flags & 128) != 0) {
                                                            bundle2.putLong("_sysu", j3);
                                                        }
                                                    }
                                                }
                                            }
                                            v4Var2 = v4Var;
                                            applicationInfo = i21.b.a(o1Var2.r).d(str5, 0);
                                            if (applicationInfo != null) {
                                            }
                                        }
                                        if (N >= 0) {
                                            bundle2.putLong("_pfo", N);
                                        }
                                        if (o4Var.e0().J(null, c0.j1)) {
                                            o4Var.f().getClass();
                                            bundle2.putLong(str, System.currentTimeMillis());
                                        }
                                        o4Var.i(new w("_f", new v(bundle2), "auto", j8), v4Var2);
                                        o4Var = o4Var;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    o4Var = this;
                                    o oVar8 = o4Var.t;
                                    U(oVar8);
                                    oVar8.n0();
                                    throw th;
                                }
                            }
                            o1Var = o1Var3;
                            str = "_elt";
                            str2 = str3;
                            s0 s0Var3 = o1Var4.w;
                            o1.m(s0Var3);
                            s0Var3.B.a("Install Referrer Reporter was called with invalid app package name");
                            b().z();
                            l0();
                            Bundle bundle22 = new Bundle();
                            long j92 = j;
                            bundle22.putLong("_c", j92);
                            bundle22.putLong("_r", j92);
                            bundle22.putLong("_uwa", 0L);
                            bundle22.putLong("_pfo", 0L);
                            bundle22.putLong("_sys", 0L);
                            bundle22.putLong("_sysu", 0L);
                            bundle22.putLong("_et", j92);
                            if (z3) {
                            }
                            c21.u.g(str2);
                            o4Var = this;
                            o oVar72 = o4Var.t;
                            U(oVar72);
                            c21.u.d(str2);
                            oVar72.z();
                            oVar72.A();
                            String str52 = str2;
                            N = oVar72.N(str52);
                            o1Var2 = o1Var;
                            if (o1Var2.r.getPackageManager() != null) {
                            }
                            if (N >= 0) {
                            }
                            if (o4Var.e0().J(null, c0.j1)) {
                            }
                            o4Var.i(new w("_f", new v(bundle22), "auto", j8), v4Var2);
                            o4Var = o4Var;
                        }
                    } else {
                        long j12 = j2;
                        o4 o4Var3 = this;
                        boolean z4 = o4Var.z;
                        o4Var = o4Var3;
                        if (z4) {
                            o4Var3.i(new w("_cd", new v(new Bundle()), "auto", j12), o4Var);
                            o4Var = o4Var3;
                        }
                    }
                    o oVar9 = o4Var.t;
                    U(oVar9);
                    oVar9.m0();
                    o oVar10 = o4Var.t;
                    U(oVar10);
                    oVar10.n0();
                    return;
                }
            } else {
                j = 1;
            }
            if (X != null) {
            }
            o oVar92 = o4Var.t;
            U(oVar92);
            oVar92.m0();
            o oVar102 = o4Var.t;
            U(oVar102);
            oVar102.n0();
            return;
        } catch (Throwable th3) {
            th = th3;
            o oVar82 = o4Var.t;
            U(oVar82);
            oVar82.n0();
            throw th;
        }
        if (V != null) {
            q4 q4Var = new q4(j5, Long.valueOf(true != V.booleanValue() ? 0L : j), "_npa", "auto");
            j2 = j5;
            if (t0 == null || !t0.e.equals(q4Var.u)) {
                W(q4Var, o4Var);
            }
        } else {
            j2 = j5;
            if (t0 != null) {
                X("_npa", o4Var);
            }
        }
        if (e0().J(null, c0.b1)) {
        }
        c0(v4Var);
        if (i != 0) {
        }
    }

    public final void Z(f fVar, v4 v4Var) {
        w wVar;
        c21.u.d(fVar.r);
        c21.u.g(fVar.s);
        c21.u.g(fVar.t);
        c21.u.d(fVar.t.s);
        b().z();
        l0();
        if (T(v4Var)) {
            if (!v4Var.y) {
                c0(v4Var);
                return;
            }
            f fVar2 = new f(fVar);
            boolean z = false;
            fVar2.v = false;
            o oVar = this.t;
            U(oVar);
            oVar.l0();
            try {
                o oVar2 = this.t;
                U(oVar2);
                String str = fVar2.r;
                c21.u.g(str);
                f x0 = oVar2.x0(str, fVar2.t.s);
                o1 o1Var = this.C;
                if (x0 != null && !x0.s.equals(fVar2.s)) {
                    a().A.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", o1Var.A.c(fVar2.t.s), fVar2.s, x0.s);
                }
                if (x0 != null && x0.v) {
                    fVar2.s = x0.s;
                    fVar2.u = x0.u;
                    fVar2.y = x0.y;
                    fVar2.w = x0.w;
                    fVar2.z = x0.z;
                    fVar2.v = true;
                    q4 q4Var = fVar2.t;
                    fVar2.t = new q4(x0.t.t, q4Var.j(), q4Var.s, x0.t.w);
                } else if (TextUtils.isEmpty(fVar2.w)) {
                    q4 q4Var2 = fVar2.t;
                    fVar2.t = new q4(fVar2.u, q4Var2.j(), q4Var2.s, fVar2.t.w);
                    fVar2.v = true;
                    z = true;
                }
                if (fVar2.v) {
                    q4 q4Var3 = fVar2.t;
                    String str2 = fVar2.r;
                    c21.u.g(str2);
                    String str3 = fVar2.s;
                    String str4 = q4Var3.s;
                    long j = q4Var3.t;
                    Object j2 = q4Var3.j();
                    c21.u.g(j2);
                    r4 r4Var = new r4(str2, str3, str4, j, j2);
                    Object obj = r4Var.e;
                    String str5 = r4Var.c;
                    o oVar3 = this.t;
                    U(oVar3);
                    if (oVar3.s0(r4Var)) {
                        a().E.d("User property updated immediately", fVar2.r, o1Var.A.c(str5), obj);
                    } else {
                        a().x.d("(2)Too many active user properties, ignoring", s0.H(fVar2.r), o1Var.A.c(str5), obj);
                    }
                    if (z && (wVar = fVar2.z) != null) {
                        l(new w(wVar, fVar2.u), v4Var);
                    }
                }
                o oVar4 = this.t;
                U(oVar4);
                if (oVar4.w0(fVar2)) {
                    a().E.d("Conditional property added", fVar2.r, o1Var.A.c(fVar2.t.s), fVar2.t.j());
                } else {
                    a().x.d("Too many conditional properties, ignoring", s0.H(fVar2.r), o1Var.A.c(fVar2.t.s), fVar2.t.j());
                }
                o oVar5 = this.t;
                U(oVar5);
                oVar5.m0();
                o oVar6 = this.t;
                U(oVar6);
                oVar6.n0();
            } catch (Throwable th) {
                o oVar7 = this.t;
                U(oVar7);
                oVar7.n0();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final s0 a() {
        o1 o1Var = this.C;
        c21.u.g(o1Var);
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        return s0Var;
    }

    public final void a0(f fVar, v4 v4Var) {
        c21.u.d(fVar.r);
        c21.u.g(fVar.t);
        c21.u.d(fVar.t.s);
        b().z();
        l0();
        if (T(v4Var)) {
            if (!v4Var.y) {
                c0(v4Var);
                return;
            }
            o oVar = this.t;
            U(oVar);
            oVar.l0();
            try {
                c0(v4Var);
                String str = fVar.r;
                c21.u.g(str);
                o oVar2 = this.t;
                U(oVar2);
                f x0 = oVar2.x0(str, fVar.t.s);
                o1 o1Var = this.C;
                if (x0 != null) {
                    a().E.c("Removing conditional user property", fVar.r, o1Var.A.c(fVar.t.s));
                    o oVar3 = this.t;
                    U(oVar3);
                    oVar3.y0(str, fVar.t.s);
                    if (x0.v) {
                        o oVar4 = this.t;
                        U(oVar4);
                        oVar4.r0(str, fVar.t.s);
                    }
                    w wVar = fVar.B;
                    if (wVar != null) {
                        v vVar = wVar.s;
                        w c0 = k0().c0(wVar.r, vVar != null ? vVar.C() : null, x0.s, wVar.u, true);
                        c21.u.g(c0);
                        l(c0, v4Var);
                    }
                } else {
                    a().A.c("Conditional user property doesn't exist", s0.H(fVar.r), o1Var.A.c(fVar.t.s));
                }
                o oVar5 = this.t;
                U(oVar5);
                oVar5.m0();
                o oVar6 = this.t;
                U(oVar6);
                oVar6.n0();
            } catch (Throwable th) {
                o oVar7 = this.t;
                U(oVar7);
                oVar7.n0();
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final m1 b() {
        o1 o1Var = this.C;
        c21.u.g(o1Var);
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        return m1Var;
    }

    public final void b0(v4 v4Var, long j) {
        o oVar = this.t;
        U(oVar);
        String str = v4Var.r;
        c21.u.g(str);
        x0 B0 = oVar.B0(str);
        if (B0 != null) {
            k0();
            String str2 = v4Var.s;
            String G = B0.G();
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean isEmpty2 = TextUtils.isEmpty(G);
            if (!isEmpty && !isEmpty2) {
                c21.u.g(str2);
                if (!str2.equals(G)) {
                    a().A.b(s0.H(B0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    o oVar2 = this.t;
                    U(oVar2);
                    o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar2).s;
                    String D = B0.D();
                    oVar2.A();
                    oVar2.z();
                    c21.u.d(D);
                    try {
                        SQLiteDatabase o0 = oVar2.o0();
                        String[] strArr = {D};
                        int delete = o0.delete("events", "app_id=?", strArr) + o0.delete("user_attributes", "app_id=?", strArr) + o0.delete("conditional_properties", "app_id=?", strArr) + o0.delete("apps", "app_id=?", strArr) + o0.delete("raw_events", "app_id=?", strArr) + o0.delete("raw_events_metadata", "app_id=?", strArr) + o0.delete("event_filters", "app_id=?", strArr) + o0.delete("property_filters", "app_id=?", strArr) + o0.delete("audience_filter_values", "app_id=?", strArr) + o0.delete("consent_settings", "app_id=?", strArr) + o0.delete("default_event_params", "app_id=?", strArr) + o0.delete("trigger_uris", "app_id=?", strArr);
                        if (o1Var.u.J(null, c0.h1)) {
                            delete += o0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (delete > 0) {
                            s0 s0Var = o1Var.w;
                            o1.m(s0Var);
                            s0Var.F.c("Deleted application data. app, records", D, Integer.valueOf(delete));
                        }
                    } catch (SQLiteException e) {
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.x.c("Error deleting application data. appId, error", s0.H(D), e);
                    }
                    B0 = null;
                }
            }
        }
        if (B0 != null) {
            boolean z = (B0.P() == -2147483648L || B0.P() == v4Var.A) ? false : true;
            String N = B0.N();
            if (z || ((B0.P() != -2147483648L || N == null || N.equals(v4Var.t)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", N);
                w wVar = new w("_au", new v(bundle), "auto", j);
                if (e0().J(null, c0.c1)) {
                    i(wVar, v4Var);
                } else {
                    j(wVar, v4Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final w80.w3 c() {
        return this.C.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x0 c0(v4 v4Var) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        b().z();
        l0();
        c21.u.g(v4Var);
        boolean z2 = v4Var.E;
        String str5 = v4Var.r;
        c21.u.d(str5);
        String str6 = v4Var.K;
        if (!str6.isEmpty()) {
            this.U.put(str5, new m4(this, str6));
        }
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str5);
        b2 j2 = e(str5).j(b2.c(v4Var.J, 100));
        a2 a2Var = a2.AD_STORAGE;
        String E = j2.i(a2Var) ? this.z.E(str5, z2) : "";
        boolean z3 = true;
        a2 a2Var2 = a2.ANALYTICS_STORAGE;
        if (B0 == null) {
            B0 = new x0(this.C, str5);
            if (j2.i(a2Var2)) {
                B0.F(o(j2));
            }
            if (j2.i(a2Var)) {
                B0.I(E);
            }
        } else {
            o1 o1Var = B0.a;
            if (j2.i(a2Var) && E != null) {
                m1 m1Var = o1Var.x;
                o1.m(m1Var);
                m1Var.z();
                if (!E.equals(B0.e)) {
                    m1 m1Var2 = o1Var.x;
                    o1.m(m1Var2);
                    m1Var2.z();
                    boolean isEmpty = TextUtils.isEmpty(B0.e);
                    B0.I(E);
                    if (z2) {
                        r3 r3Var = this.z;
                        r3Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((j2.i(a2Var) ? r3Var.D(str5) : new Pair("", Boolean.FALSE)).first) && !isEmpty) {
                            if (j2.i(a2Var2)) {
                                B0.F(o(j2));
                                z = false;
                            } else {
                                z = true;
                            }
                            o oVar2 = this.t;
                            U(oVar2);
                            if (oVar2.t0(str5, "_id") != null) {
                                o oVar3 = this.t;
                                U(oVar3);
                                if (oVar3.t0(str5, "_lair") == null) {
                                    f().getClass();
                                    r4 r4Var = new r4(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    o oVar4 = this.t;
                                    U(oVar4);
                                    oVar4.s0(r4Var);
                                }
                            }
                            o1 o1Var2 = B0.a;
                            B0.H(v4Var.s);
                            str = v4Var.B;
                            if (!TextUtils.isEmpty(str)) {
                                B0.K(str);
                            }
                            j = v4Var.v;
                            if (j != 0) {
                                B0.S(j);
                            }
                            str2 = v4Var.t;
                            if (!TextUtils.isEmpty(str2)) {
                                B0.O(str2);
                            }
                            B0.Q(v4Var.A);
                            str3 = v4Var.u;
                            if (str3 != null) {
                                B0.R(str3);
                            }
                            B0.a(v4Var.w);
                            B0.d(v4Var.y);
                            str4 = v4Var.x;
                            if (!TextUtils.isEmpty(str4)) {
                                B0.v(str4);
                            }
                            m1 m1Var3 = o1Var2.x;
                            o1.m(m1Var3);
                            m1Var3.z();
                            B0.Q |= B0.p == z2;
                            B0.p = z2;
                            Boolean bool = v4Var.G;
                            m1 m1Var4 = o1Var2.x;
                            o1.m(m1Var4);
                            m1Var4.z();
                            B0.Q |= !Objects.equals(B0.q, bool);
                            B0.q = bool;
                            B0.c(v4Var.H);
                            String str7 = v4Var.L;
                            m1 m1Var5 = o1Var2.x;
                            o1.m(m1Var5);
                            m1Var5.z();
                            B0.Q |= !Objects.equals(B0.t, str7);
                            B0.t = str7;
                            o7 o7Var = o7.s;
                            if (e0().J(null, c0.L0)) {
                                if (e0().J(null, c0.K0)) {
                                    B0.x(null);
                                }
                            } else {
                                B0.x(v4Var.I);
                            }
                            boolean z4 = v4Var.M;
                            m1 m1Var6 = o1Var2.x;
                            o1.m(m1Var6);
                            m1Var6.z();
                            B0.Q |= B0.u == z4;
                            B0.u = z4;
                            String str8 = v4Var.S;
                            m1 m1Var7 = o1Var2.x;
                            o1.m(m1Var7);
                            m1Var7.z();
                            B0.Q |= B0.C == str8;
                            B0.C = str8;
                            m8.a();
                            if (e0().J(null, c0.P0)) {
                                int i = v4Var.Q;
                                m1 m1Var8 = o1Var2.x;
                                o1.m(m1Var8);
                                m1Var8.z();
                                B0.Q |= B0.x != i;
                                B0.x = i;
                            }
                            B0.z(v4Var.N);
                            String str9 = v4Var.T;
                            m1 m1Var9 = o1Var2.x;
                            o1.m(m1Var9);
                            m1Var9.z();
                            B0.Q |= B0.G == str9;
                            B0.G = str9;
                            int i2 = v4Var.V;
                            m1 m1Var10 = o1Var2.x;
                            o1.m(m1Var10);
                            m1Var10.z();
                            B0.Q |= B0.I != i2;
                            B0.I = i2;
                            if (!B0.o()) {
                                z3 = z;
                            } else if (!z) {
                                return B0;
                            }
                            o oVar5 = this.t;
                            U(oVar5);
                            oVar5.C0(B0, z3);
                            return B0;
                        }
                    }
                    if (TextUtils.isEmpty(B0.E()) && j2.i(a2Var2)) {
                        B0.F(o(j2));
                    }
                }
            }
            if (TextUtils.isEmpty(B0.E()) && j2.i(a2Var2)) {
                B0.F(o(j2));
            }
        }
        z = false;
        o1 o1Var22 = B0.a;
        B0.H(v4Var.s);
        str = v4Var.B;
        if (!TextUtils.isEmpty(str)) {
        }
        j = v4Var.v;
        if (j != 0) {
        }
        str2 = v4Var.t;
        if (!TextUtils.isEmpty(str2)) {
        }
        B0.Q(v4Var.A);
        str3 = v4Var.u;
        if (str3 != null) {
        }
        B0.a(v4Var.w);
        B0.d(v4Var.y);
        str4 = v4Var.x;
        if (!TextUtils.isEmpty(str4)) {
        }
        m1 m1Var32 = o1Var22.x;
        o1.m(m1Var32);
        m1Var32.z();
        B0.Q |= B0.p == z2;
        B0.p = z2;
        Boolean bool2 = v4Var.G;
        m1 m1Var42 = o1Var22.x;
        o1.m(m1Var42);
        m1Var42.z();
        B0.Q |= !Objects.equals(B0.q, bool2);
        B0.q = bool2;
        B0.c(v4Var.H);
        String str72 = v4Var.L;
        m1 m1Var52 = o1Var22.x;
        o1.m(m1Var52);
        m1Var52.z();
        B0.Q |= !Objects.equals(B0.t, str72);
        B0.t = str72;
        o7 o7Var2 = o7.s;
        if (e0().J(null, c0.L0)) {
        }
        boolean z42 = v4Var.M;
        m1 m1Var62 = o1Var22.x;
        o1.m(m1Var62);
        m1Var62.z();
        B0.Q |= B0.u == z42;
        B0.u = z42;
        String str82 = v4Var.S;
        m1 m1Var72 = o1Var22.x;
        o1.m(m1Var72);
        m1Var72.z();
        B0.Q |= B0.C == str82;
        B0.C = str82;
        m8.a();
        if (e0().J(null, c0.P0)) {
        }
        B0.z(v4Var.N);
        String str92 = v4Var.T;
        m1 m1Var92 = o1Var22.x;
        o1.m(m1Var92);
        m1Var92.z();
        B0.Q |= B0.G == str92;
        B0.G = str92;
        int i22 = v4Var.V;
        m1 m1Var102 = o1Var22.x;
        o1.m(m1Var102);
        m1Var102.z();
        B0.Q |= B0.I != i22;
        B0.I = i22;
        if (!B0.o()) {
        }
        o oVar52 = this.t;
        U(oVar52);
        oVar52.C0(B0, z3);
        return B0;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final Context d() {
        return this.C.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, v4 v4Var) {
        int[] iArr;
        b().z();
        m8.a();
        h e0 = e0();
        String str = v4Var.r;
        if (!e0.J(str, c0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().x.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        o oVar = this.t;
                        U(oVar);
                        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        c21.u.d(str);
                        oVar.z();
                        oVar.A();
                        try {
                            iArr = intArray;
                        } catch (SQLiteException e) {
                            e = e;
                            iArr = intArray;
                        }
                        try {
                            int delete = oVar.o0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            s0 s0Var = o1Var.w;
                            o1.m(s0Var);
                            q0 q0Var = s0Var.F;
                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(delete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            q0Var.d(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e2) {
                            e = e2;
                            s0 s0Var2 = o1Var.w;
                            o1.m(s0Var2);
                            s0Var2.x.c("Error pruning trigger URIs. appId", s0.H(str), e);
                            i++;
                            intArray = iArr;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        o oVar2 = this.t;
        U(oVar2);
        String str2 = v4Var.r;
        c21.u.d(str2);
        oVar2.z();
        oVar2.A();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = oVar2.o0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new c4(cursor.getInt(2), cursor.getLong(1), string));
                    } while (cursor.moveToNext());
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar2).s).w;
            o1.m(s0Var3);
            s0Var3.x.c("Error querying trigger uris. appId", s0.H(str2), e3);
            arrayList = Collections.EMPTY_LIST;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    public final b2 e(String str) {
        b2 b2Var = b2.c;
        b().z();
        l0();
        HashMap hashMap = this.S;
        b2 b2Var2 = (b2) hashMap.get(str);
        if (b2Var2 == null) {
            o oVar = this.t;
            U(oVar);
            b2Var2 = oVar.S(str);
            if (b2Var2 == null) {
                b2Var2 = b2.c;
            }
            b().z();
            l0();
            hashMap.put(str, b2Var2);
            o oVar2 = this.t;
            U(oVar2);
            oVar2.U(str, b2Var2);
        }
        return b2Var2;
    }

    public final h e0() {
        o1 o1Var = this.C;
        c21.u.g(o1Var);
        return o1Var.u;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final g21.a f() {
        o1 o1Var = this.C;
        c21.u.g(o1Var);
        return o1Var.B;
    }

    public final i1 f0() {
        i1 i1Var = this.r;
        U(i1Var);
        return i1Var;
    }

    public final long g() {
        f().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        r3 r3Var = this.z;
        r3Var.A();
        r3Var.z();
        a1 a1Var = r3Var.B;
        long a = a1Var.a();
        if (a == 0) {
            o1.k(((o1) ((androidx.compose.foundation.lazy.layout.s0) r3Var).s).z);
            a = r2.x0().nextInt(86400000) + 1;
            a1Var.b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    public final o g0() {
        o oVar = this.t;
        U(oVar);
        return oVar;
    }

    public final void h(w wVar, String str) {
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str);
        if (B0 != null) {
            o1 o1Var = B0.a;
            if (!TextUtils.isEmpty(B0.N())) {
                Boolean P = P(B0);
                if (P == null) {
                    if (!"_ui".equals(wVar.r)) {
                        a().A.b(s0.H(str), "Could not find package. appId");
                    }
                } else if (!P.booleanValue()) {
                    a().x.b(s0.H(str), "App version does not match; dropping event. appId");
                    return;
                }
                String G = B0.G();
                String N = B0.N();
                long P2 = B0.P();
                m1 m1Var = o1Var.x;
                o1.m(m1Var);
                m1Var.z();
                String str2 = B0.l;
                m1 m1Var2 = o1Var.x;
                o1.m(m1Var2);
                m1Var2.z();
                long j = B0.m;
                m1 m1Var3 = o1Var.x;
                o1.m(m1Var3);
                m1Var3.z();
                long j2 = B0.n;
                m1 m1Var4 = o1Var.x;
                o1.m(m1Var4);
                m1Var4.z();
                boolean z = B0.o;
                String J = B0.J();
                m1 m1Var5 = o1Var.x;
                o1.m(m1Var5);
                m1Var5.z();
                boolean z2 = B0.p;
                Boolean w = B0.w();
                long b = B0.b();
                m1 m1Var6 = o1Var.x;
                o1.m(m1Var6);
                m1Var6.z();
                ArrayList arrayList = B0.s;
                String g = e(str).g();
                boolean y = B0.y();
                m1 m1Var7 = o1Var.x;
                o1.m(m1Var7);
                m1Var7.z();
                long j3 = B0.v;
                int i = e(str).b;
                String str3 = o0(str).b;
                m1 m1Var8 = o1Var.x;
                o1.m(m1Var8);
                m1Var8.z();
                int i2 = B0.x;
                m1 m1Var9 = o1Var.x;
                o1.m(m1Var9);
                m1Var9.z();
                i(wVar, new v4(str, G, N, P2, str2, j, j2, (String) null, z, false, J, 0L, 0, z2, false, w, b, (List) arrayList, g, "", (String) null, y, j3, i, str3, i2, B0.B, B0.C(), B0.s(), 0L, B0.t()));
                return;
            }
        }
        a().E.b(str, "No app data available; dropping event");
    }

    public final y0 h0() {
        y0 y0Var = this.u;
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:37:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(w wVar, v4 v4Var) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        Bundle bundle;
        w d;
        v vVar;
        String str = v4Var.r;
        c21.u.d(str);
        t0 c = t0.c(wVar);
        Bundle bundle2 = (Bundle) c.e;
        t4 k0 = k0();
        o oVar = this.t;
        U(oVar);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
        oVar.z();
        oVar.A();
        Cursor cursor3 = null;
        try {
            try {
                cursor = oVar.o0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e) {
                    e = e;
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.x.b(e, "Error selecting default event parameters");
                    if (cursor != null) {
                    }
                    bundle = null;
                    k0.K(bundle2, bundle);
                    t4 k02 = k0();
                    h e0 = e0();
                    e0.getClass();
                    k02.I(c, Math.max(Math.min(e0.H(str, c0.X), 100), 25));
                    d = c.d();
                    if (!e0().J(null, c0.f1)) {
                    }
                    j(d, v4Var);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) ((com.google.android.gms.internal.measurement.a3) w0.m0(com.google.android.gms.internal.measurement.b3.z(), cursor.getBlob(0))).e();
                oVar.t.j0();
                bundle = w0.G(b3Var.p());
                cursor.close();
            } catch (IOException e3) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.c("Failed to retrieve default event parameters. appId", s0.H(str), e3);
            }
            k0.K(bundle2, bundle);
            t4 k022 = k0();
            h e02 = e0();
            e02.getClass();
            k022.I(c, Math.max(Math.min(e02.H(str, c0.X), 100), 25));
            d = c.d();
            if (!e0().J(null, c0.f1) && "_cmp".equals(d.r)) {
                vVar = d.s;
                if ("referrer API v2".equals(vVar.r.getString("_cis"))) {
                    String string = vVar.r.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        W(new q4(d.u, string, "_lgclid", "auto"), v4Var);
                    }
                }
            }
            j(d, v4Var);
        }
        s0 s0Var3 = o1Var.w;
        o1.m(s0Var3);
        s0Var3.F.a("Default event parameters not found");
        if (cursor != null) {
            cursor.close();
        }
        bundle = null;
        k0.K(bundle2, bundle);
        t4 k0222 = k0();
        h e022 = e0();
        e022.getClass();
        k0222.I(c, Math.max(Math.min(e022.H(str, c0.X), 100), 25));
        d = c.d();
        if (!e0().J(null, c0.f1)) {
            vVar = d.s;
            if ("referrer API v2".equals(vVar.r.getString("_cis"))) {
            }
        }
        j(d, v4Var);
    }

    public final d i0() {
        d dVar = this.w;
        U(dVar);
        return dVar;
    }

    public final void j(w wVar, v4 v4Var) {
        w wVar2;
        List A0;
        o1 o1Var;
        List A02;
        List<f> A03;
        String str;
        c21.u.g(v4Var);
        String str2 = v4Var.r;
        c21.u.d(str2);
        b().z();
        l0();
        long j = wVar.u;
        t0 c = t0.c(wVar);
        b().z();
        t4.r0((this.W == null || (str = this.X) == null || !str.equals(str2)) ? null : this.W, (Bundle) c.e, false);
        w d = c.d();
        j0();
        if (TextUtils.isEmpty(v4Var.s)) {
            return;
        }
        if (!v4Var.y) {
            c0(v4Var);
            return;
        }
        List list = v4Var.I;
        if (list != null) {
            String str3 = d.r;
            if (!list.contains(str3)) {
                a().E.d("Dropping non-safelisted event. appId, event name, origin", str2, d.r, d.t);
                return;
            } else {
                Bundle C = d.s.C();
                C.putLong("ga_safelisted", 1L);
                wVar2 = new w(str3, new v(C), d.t, d.u);
            }
        } else {
            wVar2 = d;
        }
        o oVar = this.t;
        U(oVar);
        oVar.l0();
        try {
            String str4 = wVar2.r;
            if ("_s".equals(str4)) {
                o oVar2 = this.t;
                U(oVar2);
                if (!oVar2.O(str2, "_s") && wVar2.s.r.getLong("_sid") != 0) {
                    o oVar3 = this.t;
                    U(oVar3);
                    if (!oVar3.O(str2, "_f")) {
                        o oVar4 = this.t;
                        U(oVar4);
                        if (!oVar4.O(str2, "_v")) {
                            o oVar5 = this.t;
                            U(oVar5);
                            f().getClass();
                            oVar5.R(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(wVar2, str2));
                        }
                    }
                    o oVar6 = this.t;
                    U(oVar6);
                    oVar6.R(str2, null, "_sid", k(wVar2, str2));
                }
            }
            o oVar7 = this.t;
            U(oVar7);
            c21.u.d(str2);
            oVar7.z();
            oVar7.A();
            if (j < 0) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar7).s).w;
                o1.m(s0Var);
                s0Var.A.c("Invalid time querying timed out conditional properties", s0.H(str2), Long.valueOf(j));
                A0 = Collections.EMPTY_LIST;
            } else {
                A0 = oVar7.A0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = A0.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                o1Var = this.C;
                if (!hasNext) {
                    break;
                }
                f fVar = (f) it.next();
                if (fVar != null) {
                    a().F.d("User property timed out", fVar.r, o1Var.A.c(fVar.t.s), fVar.t.j());
                    w wVar3 = fVar.x;
                    if (wVar3 != null) {
                        l(new w(wVar3, j), v4Var);
                    }
                    o oVar8 = this.t;
                    U(oVar8);
                    oVar8.y0(str2, fVar.t.s);
                }
            }
            o oVar9 = this.t;
            U(oVar9);
            c21.u.d(str2);
            oVar9.z();
            oVar9.A();
            if (j < 0) {
                s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar9).s).w;
                o1.m(s0Var2);
                s0Var2.A.c("Invalid time querying expired conditional properties", s0.H(str2), Long.valueOf(j));
                A02 = Collections.EMPTY_LIST;
            } else {
                A02 = oVar9.A0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(A02.size());
            Iterator it2 = A02.iterator();
            while (it2.hasNext()) {
                f fVar2 = (f) it2.next();
                if (fVar2 != null) {
                    Iterator it3 = it2;
                    a().F.d("User property expired", fVar2.r, o1Var.A.c(fVar2.t.s), fVar2.t.j());
                    o oVar10 = this.t;
                    U(oVar10);
                    oVar10.r0(str2, fVar2.t.s);
                    w wVar4 = fVar2.B;
                    if (wVar4 != null) {
                        arrayList.add(wVar4);
                    }
                    o oVar11 = this.t;
                    U(oVar11);
                    oVar11.y0(str2, fVar2.t.s);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(new w((w) obj, j), v4Var);
            }
            o oVar12 = this.t;
            U(oVar12);
            c21.u.d(str2);
            c21.u.d(str4);
            oVar12.z();
            oVar12.A();
            if (j < 0) {
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar12).s;
                s0 s0Var3 = o1Var2.w;
                o1.m(s0Var3);
                s0Var3.A.d("Invalid time querying triggered conditional properties", s0.H(str2), o1Var2.A.a(str4), Long.valueOf(j));
                A03 = Collections.EMPTY_LIST;
            } else {
                A03 = oVar12.A0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(A03.size());
            for (f fVar3 : A03) {
                if (fVar3 != null) {
                    q4 q4Var = fVar3.t;
                    String str5 = fVar3.r;
                    c21.u.g(str5);
                    String str6 = fVar3.s;
                    String str7 = q4Var.s;
                    Object j2 = q4Var.j();
                    c21.u.g(j2);
                    r4 r4Var = new r4(str5, str6, str7, j, j2);
                    Object obj2 = r4Var.e;
                    String str8 = r4Var.c;
                    o oVar13 = this.t;
                    U(oVar13);
                    if (oVar13.s0(r4Var)) {
                        a().F.d("User property triggered", fVar3.r, o1Var.A.c(str8), obj2);
                    } else {
                        a().x.d("Too many active user properties, ignoring", s0.H(fVar3.r), o1Var.A.c(str8), obj2);
                    }
                    w wVar5 = fVar3.z;
                    if (wVar5 != null) {
                        arrayList2.add(wVar5);
                    }
                    fVar3.t = new q4(r4Var);
                    fVar3.v = true;
                    o oVar14 = this.t;
                    U(oVar14);
                    oVar14.w0(fVar3);
                }
            }
            l(wVar2, v4Var);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                l(new w((w) obj3, j), v4Var);
            }
            o oVar15 = this.t;
            U(oVar15);
            oVar15.m0();
            o oVar16 = this.t;
            U(oVar16);
            oVar16.n0();
        } catch (Throwable th) {
            o oVar17 = this.t;
            U(oVar17);
            oVar17.n0();
            throw th;
        }
    }

    public final w0 j0() {
        w0 w0Var = this.x;
        U(w0Var);
        return w0Var;
    }

    public final Bundle k(w wVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", wVar.s.r.getLong("_sid"));
        o oVar = this.t;
        U(oVar);
        r4 t0 = oVar.t0(str, "_sno");
        if (t0 != null) {
            Object obj = t0.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final t4 k0() {
        o1 o1Var = this.C;
        c21.u.g(o1Var);
        t4 t4Var = o1Var.z;
        o1.k(t4Var);
        return t4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:146|(42:148|(1:152)|153|(1:155)(1:349)|156|(1:158)(15:320|(1:322)(1:348)|323|(1:325)(1:347)|326|(1:328)(1:346)|329|(1:331)(1:345)|332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)(1:342)|341)|159|(1:161)|162|(1:164)(1:319)|(1:318)(34:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:309))(1:311))(1:315)|310)(2:316|317))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:305)|197|(4:199|(1:201)|202|(2:208|(29:210|(1:212)(1:304)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:303)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:285))(3:286|287|(1:292)(1:291)))|271|272|273|274|(1:276)(2:281|282)|277|278|279))))|308|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279))|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:391|(2:393|(12:395|396|397|(8:399|58|(0)(0)|61|62|(0)(0)|68|69)|57|58|(0)(0)|61|62|(0)(0)|68|69))|400|401|402|403|404|396|397|(0)|57|58|(0)(0)|61|62|(0)(0)|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(59:(2:71|(3:73|(1:75)|76))|77|(2:79|(3:81|(1:83)|84))|85|86|(1:88)|89|(2:93|(1:95))|96|(2:102|(2:104|105))|108|(3:109|110|111)|112|(1:114)|115|(2:117|(2:121|122)(1:120))(1:356)|123|124|(1:126)|127|(1:129)(1:355)|130|(1:132)(1:354)|133|(1:135)(1:353)|136|(1:138)(1:352)|139|140|(1:142)(1:351)|143|144|(13:(2:146|(42:148|(1:152)|153|(1:155)(1:349)|156|(1:158)(15:320|(1:322)(1:348)|323|(1:325)(1:347)|326|(1:328)(1:346)|329|(1:331)(1:345)|332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)(1:342)|341)|159|(1:161)|162|(1:164)(1:319)|(1:318)(34:168|(2:169|(3:171|(3:173|174|(2:176|(2:178|180)(1:309))(1:311))(1:315)|310)(2:316|317))|181|(1:183)|(1:186)|187|(1:189)|190|(5:193|194|(1:196)(1:305)|197|(4:199|(1:201)|202|(2:208|(29:210|(1:212)(1:304)|213|(1:215)|216|217|(2:219|(1:221)(2:222|223))|224|(7:226|227|228|229|(1:231)|232|233)(1:303)|234|(1:238)|239|(1:241)|242|(6:245|(2:247|(5:249|(1:251)(1:258)|252|(2:254|255)(1:257)|256))|259|260|256|243)|261|262|263|264|265|(2:266|(2:268|(1:270)(1:285))(3:286|287|(1:292)(1:291)))|271|272|273|274|(1:276)(2:281|282)|277|278|279))))|308|217|(0)|224|(0)(0)|234|(2:236|238)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|184|(0)|187|(0)|190|(5:193|194|(0)(0)|197|(0))|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279))|263|264|265|(3:266|(0)(0)|285)|271|272|273|274|(0)(0)|277|278|279)|350|159|(0)|162|(0)(0)|(1:166)|318|184|(0)|187|(0)|190|(0)|308|217|(0)|224|(0)(0)|234|(0)|239|(0)|242|(1:243)|261|262) */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0c42, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0c49, code lost:
    
        ((com.google.android.gms.measurement.internal.o1) ((androidx.compose.foundation.lazy.layout.s0) r1).s).a().D().c("Error storing raw event. appId", com.google.android.gms.measurement.internal.s0.H((java.lang.String) r3.u), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0c63, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0c80, code lost:
    
        r5.a().D().c("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.s0.H(r4.q()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02fe, code lost:
    
        ((com.google.android.gms.measurement.internal.o1) ((androidx.compose.foundation.lazy.layout.s0) r10).s).a().D().c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.s0.H(r13), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07c0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x07ea A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0890 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08a0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x08b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08c4 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08dc A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09b6 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x09d6 A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a47 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a65 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a7e A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b84 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:229:0x09df, B:231:0x09f6, B:233:0x0a07, B:234:0x0a3f, B:236:0x0a47, B:238:0x0a51, B:239:0x0a5b, B:241:0x0a65, B:242:0x0a6f, B:243:0x0a78, B:245:0x0a7e, B:247:0x0ac8, B:249:0x0ada, B:252:0x0af9, B:254:0x0b09, B:258:0x0ae9, B:262:0x0b1c, B:264:0x0b5e, B:265:0x0b69, B:266:0x0b7e, B:268:0x0b84, B:272:0x0bcf, B:274:0x0c1b, B:276:0x0c2c, B:277:0x0c95, B:282:0x0c46, B:284:0x0c49, B:287:0x0b92, B:289:0x0bbc, B:295:0x0c66, B:296:0x0c7f, B:298:0x0c80), top: B:228:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c2c A[Catch: all -> 0x0a04, SQLiteException -> 0x0c42, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c42, blocks: (B:274:0x0c1b, B:276:0x0c2c), top: B:273:0x0c1b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08c9 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:194:0x08b9, B:196:0x08c4, B:197:0x08d2, B:199:0x08dc, B:202:0x08f0, B:204:0x08fc, B:206:0x0908, B:208:0x0912, B:210:0x0920, B:212:0x0938, B:213:0x0951, B:215:0x095f, B:216:0x0968, B:217:0x0973, B:219:0x09b6, B:222:0x09c1, B:223:0x09cb, B:224:0x09cc, B:226:0x09d6, B:305:0x08c9), top: B:193:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07ed A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:43:0x01cc, B:46:0x01d9, B:48:0x01e1, B:51:0x01ef, B:58:0x036c, B:62:0x03a9, B:64:0x03e5, B:66:0x03ea, B:67:0x0401, B:71:0x040c, B:73:0x0426, B:75:0x042c, B:76:0x0443, B:79:0x0462, B:83:0x0484, B:84:0x049b, B:85:0x04a4, B:88:0x04c1, B:89:0x04d5, B:91:0x04dd, B:93:0x04e7, B:95:0x04ed, B:96:0x04f4, B:98:0x0501, B:100:0x0509, B:102:0x0511, B:105:0x0519, B:108:0x0525, B:110:0x0532, B:114:0x057a, B:115:0x058f, B:117:0x05be, B:120:0x05e8, B:122:0x0638, B:124:0x0666, B:126:0x0695, B:127:0x0698, B:129:0x069e, B:130:0x06a6, B:132:0x06ac, B:133:0x06b4, B:135:0x06ba, B:138:0x06c9, B:140:0x06d8, B:142:0x06e1, B:143:0x06e9, B:146:0x071a, B:148:0x0723, B:152:0x0738, B:156:0x0745, B:161:0x07c0, B:162:0x07c7, B:164:0x07ea, B:166:0x07f3, B:168:0x07fe, B:169:0x0818, B:171:0x081e, B:174:0x0838, B:176:0x0844, B:178:0x0851, B:181:0x0886, B:186:0x0890, B:187:0x0893, B:189:0x08a0, B:190:0x08a3, B:201:0x08e7, B:313:0x0872, B:319:0x07ed, B:320:0x074e, B:323:0x075b, B:326:0x0769, B:329:0x0777, B:332:0x0785, B:335:0x0793, B:338:0x079f, B:341:0x07ad, B:356:0x0659, B:359:0x055f, B:360:0x037e, B:361:0x038a, B:363:0x0390, B:370:0x039e, B:374:0x020f, B:377:0x021d, B:379:0x0232, B:384:0x024a, B:387:0x027a, B:389:0x0280, B:391:0x028e, B:393:0x029c, B:395:0x02a5, B:397:0x032e, B:399:0x0338, B:401:0x02d2, B:403:0x02eb, B:404:0x0313, B:407:0x02fe, B:409:0x0256, B:411:0x0274), top: B:42:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(w wVar, v4 v4Var) {
        o4 o4Var;
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        r4 r4Var;
        r4 r4Var2;
        l4 l4Var;
        long j2;
        long intValue;
        long j3;
        t a;
        String str6;
        String str7;
        String str8;
        long j4;
        String str9;
        long j5;
        Map b;
        String str10;
        ArrayList arrayList;
        b2 j6;
        String str11;
        x0 B0;
        int i;
        List u0;
        int i2;
        o g0;
        com.google.android.gms.internal.measurement.j3 j3Var;
        o g02;
        Iterator<String> it;
        int i3;
        ContentValues contentValues;
        String str12;
        long k0;
        Pair D;
        x0 B02;
        r4 t0;
        c21.u.g(v4Var);
        boolean z = v4Var.E;
        long j7 = v4Var.H;
        long j8 = v4Var.w;
        String str13 = v4Var.J;
        long j9 = v4Var.v;
        long j10 = v4Var.A;
        String str14 = v4Var.L;
        String str15 = v4Var.t;
        String str16 = v4Var.u;
        long j12 = j8;
        boolean z2 = v4Var.y;
        String str17 = v4Var.r;
        c21.u.d(str17);
        long nanoTime = System.nanoTime();
        b().z();
        l0();
        j0();
        String str18 = v4Var.s;
        if (TextUtils.isEmpty(str18)) {
            return;
        }
        if (!z2) {
            c0(v4Var);
            return;
        }
        i1 f0 = f0();
        String str19 = wVar.r;
        boolean O = f0.O(str17, str19);
        o1 o1Var = this.C;
        l4 l4Var2 = this.a0;
        if (O) {
            a().E().c("Dropping blocked event. appId", s0.H(str17), o1Var.n().a(str19));
            if (!"1".equals(f0().e(str17, "measurement.upload.blacklist_internal")) && !"1".equals(f0().e(str17, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str19)) {
                    return;
                }
                k0();
                t4.P(l4Var2, str17, 11, "_ev", str19, 0);
                return;
            }
            x0 B03 = g0().B0(str17);
            if (B03 != null) {
                o1 o1Var2 = B03.a;
                m1 m1Var = o1Var2.x;
                o1.m(m1Var);
                m1Var.z();
                long j13 = B03.S;
                m1 m1Var2 = o1Var2.x;
                o1.m(m1Var2);
                m1Var2.z();
                long max = Math.max(j13, B03.R);
                f().getClass();
                long abs = Math.abs(System.currentTimeMillis() - max);
                e0();
                if (abs > ((Long) c0.N.a(null)).longValue()) {
                    a().F().a("Fetching config for blocked app");
                    z(B03);
                    return;
                }
                return;
            }
            return;
        }
        t0 c = t0.c(wVar);
        t4 k02 = k0();
        h e0 = e0();
        e0.getClass();
        k02.I(c, Math.max(Math.min(e0.H(str17, c0.X), 100), 25));
        int max2 = Math.max(Math.min(e0().H(str17, c0.g0), 35), 10);
        Bundle bundle = (Bundle) c.e;
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            String str20 = (String) it2.next();
            if ("items".equals(str20)) {
                k0().J(bundle.getParcelableArray(str20), max2);
            }
        }
        w d = c.d();
        v vVar = d.s;
        String str21 = d.r;
        if (Log.isLoggable(a().J(), 2)) {
            a().G().b(o1Var.n().d(d), "Logging event");
        }
        g0().l0();
        try {
            c0(v4Var);
            boolean z3 = "ecommerce_purchase".equals(str21) || "purchase".equals(str21) || "refund".equals(str21);
            if (!"_iap".equals(str21)) {
                if (!z3) {
                    str3 = str16;
                    str4 = "events";
                    str = str14;
                    str5 = str17;
                    str2 = str15;
                    l4Var = l4Var2;
                    boolean y0 = t4.y0(str21);
                    boolean equals = "_err".equals(str21);
                    k0();
                    if (vVar == null) {
                        j2 = 0;
                    } else {
                        Iterator<String> it3 = vVar.r.keySet().iterator();
                        j2 = 0;
                        while (it3.hasNext()) {
                            if (vVar.j(it3.next()) instanceof Parcelable[]) {
                                j2 += ((Parcelable[]) r6).length;
                            }
                        }
                    }
                    String str22 = str5;
                    k E0 = g0().E0(g(), str22, j2 + 1, true, y0, false, equals, false, false, false);
                    long j14 = E0.b;
                    e0();
                    intValue = j14 - ((Integer) c0.l.a(null)).intValue();
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            a().D().c("Data loss. Too many events logged. appId, count", s0.H(str22), Long.valueOf(E0.b));
                        }
                        g0().m0();
                    } else {
                        if (y0) {
                            long j15 = E0.a;
                            e0();
                            long intValue2 = j15 - ((Integer) c0.n.a(null)).intValue();
                            if (intValue2 > 0) {
                                if (intValue2 % 1000 == 1) {
                                    a().D().c("Data loss. Too many public events logged. appId, count", s0.H(str22), Long.valueOf(E0.a));
                                }
                                k0();
                                t4.P(l4Var, str22, 16, "_ev", d.r, 0);
                                g0().m0();
                            }
                        }
                        String str23 = str22;
                        if (equals) {
                            long max3 = E0.d - Math.max(0, Math.min(1000000, e0().H(str23, c0.m)));
                            if (max3 > 0) {
                                if (max3 == 1) {
                                    a().D().c("Too many error events logged. appId, count", s0.H(str23), Long.valueOf(E0.d));
                                }
                                g0().m0();
                            }
                        }
                        Bundle C = vVar.C();
                        t4 k03 = k0();
                        String str24 = d.t;
                        k03.O(C, "_o", str24);
                        if (k0().a0(str23, v4Var.S)) {
                            k0().O(C, "_dbg", 1L);
                            k0().O(C, "_r", 1L);
                        }
                        if ("_s".equals(str21) && (t0 = g0().t0(str23, "_sno")) != null) {
                            Object obj = t0.e;
                            if (obj instanceof Long) {
                                k0().O(C, "_sno", obj);
                            }
                        }
                        if (e0().J(null, c0.X0) && Objects.equals(str24, "am") && str21.equals("_ai")) {
                            Object obj2 = C.get("value");
                            if (obj2 instanceof String) {
                                try {
                                    double parseDouble = Double.parseDouble((String) obj2);
                                    C.remove("value");
                                    C.putDouble("value", parseDouble);
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                        o g03 = g0();
                        c21.u.d(str23);
                        g03.z();
                        g03.A();
                        try {
                            j3 = g03.o0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str23, String.valueOf(Math.max(0, Math.min(1000000, ((o1) ((androidx.compose.foundation.lazy.layout.s0) g03).s).u.H(str23, c0.q))))});
                        } catch (SQLiteException e) {
                            ((o1) ((androidx.compose.foundation.lazy.layout.s0) g03).s).a().D().c("Error deleting over the limit events. appId", s0.H(str23), e);
                            j3 = 0;
                        }
                        if (j3 > 0) {
                            a().E().c("Data lost. Too many events stored on disk, deleted. appId", s0.H(str23), Long.valueOf(j3));
                        }
                        o1 o1Var3 = this.C;
                        s sVar = new s(o1Var3, d.t, str23, d.r, d.u, 0L, C);
                        o g04 = g0();
                        String str25 = (String) sVar.v;
                        String str26 = str4;
                        t X = g04.X(str26, str23, str25);
                        if (X == null) {
                            long P = g0().P(str23);
                            e0().getClass();
                            b0 b0Var = c0.W;
                            l4 l4Var3 = l4Var;
                            if (P < Math.max(Math.min(r4.H(str23, b0Var), 2000), 500) || !y0) {
                                l4Var = l4Var3;
                                a = new t(str23, str25, 0L, 0L, 0L, sVar.s, 0L, null, null, null, null);
                                str23 = str23;
                            } else {
                                q0 D2 = a().D();
                                r0 H = s0.H(str23);
                                String a2 = o1Var3.n().a(str25);
                                h e02 = e0();
                                e02.getClass();
                                D2.d("Too many event names used, ignoring event. appId, name, supported count", H, a2, Integer.valueOf(Math.max(Math.min(e02.H(str23, b0Var), 2000), 500)));
                                k0();
                                t4.P(l4Var3, str23, 8, null, null, 0);
                            }
                        } else {
                            sVar = sVar.e(o1Var3, X.f);
                            a = X.a(sVar.s);
                        }
                        s sVar2 = sVar;
                        g0().Y(str26, a);
                        b().z();
                        l0();
                        String str27 = (String) sVar2.u;
                        c21.u.d(str27);
                        c21.u.b(str27.equals(str23));
                        com.google.android.gms.internal.measurement.i3 U = com.google.android.gms.internal.measurement.j3.U();
                        U.B();
                        U.k();
                        if (!TextUtils.isEmpty(str23)) {
                            U.r(str23);
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str6 = str3;
                        } else {
                            str6 = str3;
                            U.p(str6);
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str7 = str2;
                        } else {
                            str7 = str2;
                            U.s(str7);
                        }
                        if (TextUtils.isEmpty(str)) {
                            str8 = str;
                        } else {
                            str8 = str;
                            U.U(str8);
                        }
                        if (j10 != -2147483648L) {
                            j4 = j10;
                            U.O((int) j4);
                        } else {
                            j4 = j10;
                        }
                        String str28 = str6;
                        U.u(j9);
                        if (TextUtils.isEmpty(str18)) {
                            str9 = str18;
                        } else {
                            str9 = str18;
                            U.K(str9);
                        }
                        c21.u.g(str23);
                        String str29 = str8;
                        b2 j16 = e(str23).j(b2.c(str13, 100));
                        U.T(j16.f());
                        m8.a();
                        boolean J = e0().J(str23, c0.P0);
                        a2 a2Var = a2.AD_STORAGE;
                        try {
                            if (J) {
                                k0();
                                if (t4.W(str23)) {
                                    U.C(v4Var.Q);
                                    j5 = j4;
                                    long j17 = v4Var.R;
                                    if (!j16.i(a2Var) && j17 != 0) {
                                        j17 = (j17 & (-2)) | 32;
                                    }
                                    U.W(j17 == 1);
                                    if (j17 != 0) {
                                        com.google.android.gms.internal.measurement.q2 w = com.google.android.gms.internal.measurement.r2.w();
                                        w.i((j17 & 1) != 0);
                                        w.j((j17 & 2) != 0);
                                        w.k((j17 & 4) != 0);
                                        w.l((j17 & 8) != 0);
                                        w.n((j17 & 16) != 0);
                                        w.o((j17 & 32) != 0);
                                        w.p((j17 & 64) != 0);
                                        U.D((com.google.android.gms.internal.measurement.r2) w.e());
                                    }
                                    if (j12 != 0) {
                                        U.z(j12);
                                        j12 = j12;
                                    }
                                    U.R(j7);
                                    w0 j0 = j0();
                                    com.google.android.gms.internal.measurement.e4 a3 = com.google.android.gms.internal.measurement.e4.a(j0.t.C.d().getContentResolver(), com.google.android.gms.internal.measurement.l4.a(), b21.r.s);
                                    b = a3 != null ? Collections.EMPTY_MAP : a3.b();
                                    if (b == null && !b.isEmpty()) {
                                        arrayList = new ArrayList();
                                        int intValue3 = ((Integer) c0.f0.a(null)).intValue();
                                        Iterator it4 = b.entrySet().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                str10 = str7;
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) it4.next();
                                            Iterator it5 = it4;
                                            str10 = str7;
                                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                                try {
                                                    int parseInt = Integer.parseInt((String) entry.getValue());
                                                    if (parseInt != 0) {
                                                        arrayList.add(Integer.valueOf(parseInt));
                                                        if (arrayList.size() >= intValue3) {
                                                            ((o1) ((androidx.compose.foundation.lazy.layout.s0) j0).s).a().E().b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                            break;
                                                        }
                                                        continue;
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (NumberFormatException e2) {
                                                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) j0).s).a().E().b(e2, "Experiment ID NumberFormatException");
                                                }
                                            }
                                            it4 = it5;
                                            str7 = str10;
                                        }
                                        if (arrayList.isEmpty()) {
                                        }
                                        if (arrayList != null) {
                                            U.Q(arrayList);
                                        }
                                        if (e0().J(null, c0.a1)) {
                                            U.G();
                                        }
                                        j6 = e(str23).j(b2.c(str13, 100));
                                        if (j6.i(a2Var) && z) {
                                            try {
                                                r3 r3Var = this.z;
                                                r3Var.getClass();
                                                D = !j6.i(a2Var) ? r3Var.D(str23) : new Pair("", Boolean.FALSE);
                                                if (!TextUtils.isEmpty((CharSequence) D.first)) {
                                                    U.w((String) D.first);
                                                    Object obj3 = D.second;
                                                    if (obj3 != null) {
                                                        U.x(((Boolean) obj3).booleanValue());
                                                    }
                                                    if (!((String) sVar2.v).equals("_fx") && !((String) D.first).equals("00000000-0000-0000-0000-000000000000") && (B02 = g0().B0(str23)) != null) {
                                                        m1 m1Var3 = B02.a.x;
                                                        o1.m(m1Var3);
                                                        m1Var3.z();
                                                        if (B02.y) {
                                                            u(str23, false, null, null);
                                                            Bundle bundle2 = new Bundle();
                                                            m1 m1Var4 = B02.a.x;
                                                            o1.m(m1Var4);
                                                            m1Var4.z();
                                                            Long l = B02.z;
                                                            if (l != null) {
                                                                str11 = str9;
                                                                bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                            } else {
                                                                str11 = str9;
                                                            }
                                                            m1 m1Var5 = B02.a.x;
                                                            o1.m(m1Var5);
                                                            m1Var5.z();
                                                            Long l2 = B02.A;
                                                            if (l2 != null) {
                                                                bundle2.putLong("_uwa", l2.longValue());
                                                            }
                                                            bundle2.putLong("_r", 1L);
                                                            l4Var.a(str23, "_fx", bundle2);
                                                            o1Var.q().B();
                                                            String str30 = Build.MODEL;
                                                            U.l();
                                                            o1Var.q().B();
                                                            String str31 = Build.VERSION.RELEASE;
                                                            U.b();
                                                            ((com.google.android.gms.internal.measurement.j3) U.s).o0(str31);
                                                            U.o((int) o1Var.q().D());
                                                            U.n(o1Var.q().E());
                                                            U.V(v4Var.N);
                                                            if (o1Var.e()) {
                                                                U.q();
                                                                if (!TextUtils.isEmpty(null)) {
                                                                    U.b();
                                                                    ((com.google.android.gms.internal.measurement.j3) U.s).R0(null);
                                                                    throw null;
                                                                }
                                                            }
                                                            B0 = g0().B0(str23);
                                                            if (B0 != null) {
                                                                B0 = new x0(o1Var, str23);
                                                                o4Var = this;
                                                                try {
                                                                    B0.F(o4Var.o(j6));
                                                                    B0.K(v4Var.B);
                                                                    B0.H(str11);
                                                                    if (j6.i(a2Var)) {
                                                                        B0.I(o4Var.z.E(str23, z));
                                                                    }
                                                                    B0.e(0L);
                                                                    B0.L(0L);
                                                                    B0.M(0L);
                                                                    B0.O(str10);
                                                                    B0.Q(j5);
                                                                    B0.R(str28);
                                                                    B0.S(j9);
                                                                    B0.a(j12);
                                                                    B0.d(z2);
                                                                    B0.c(j7);
                                                                    i = 0;
                                                                    o4Var.g0().C0(B0, false);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    o4Var.g0().n0();
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i = 0;
                                                                o4Var = this;
                                                            }
                                                            if (j6.i(a2.ANALYTICS_STORAGE) && !TextUtils.isEmpty(B0.E())) {
                                                                String E = B0.E();
                                                                c21.u.g(E);
                                                                U.y(E);
                                                            }
                                                            if (!TextUtils.isEmpty(B0.J())) {
                                                                String J2 = B0.J();
                                                                c21.u.g(J2);
                                                                U.N(J2);
                                                            }
                                                            u0 = o4Var.g0().u0(str23);
                                                            i2 = i;
                                                            while (i2 < u0.size()) {
                                                                com.google.android.gms.internal.measurement.r3 A = com.google.android.gms.internal.measurement.s3.A();
                                                                String str32 = ((r4) u0.get(i2)).c;
                                                                A.b();
                                                                ((com.google.android.gms.internal.measurement.s3) A.s).C(str32);
                                                                long j18 = ((r4) u0.get(i2)).d;
                                                                A.b();
                                                                ((com.google.android.gms.internal.measurement.s3) A.s).B(j18);
                                                                o4Var.j0().X(A, ((r4) u0.get(i2)).e);
                                                                U.c0(A);
                                                                if ("_sid".equals(((r4) u0.get(i2)).c)) {
                                                                    m1 m1Var6 = B0.a.x;
                                                                    o1.m(m1Var6);
                                                                    m1Var6.z();
                                                                    if (B0.w != 0) {
                                                                        w0 j02 = o4Var.j0();
                                                                        if (TextUtils.isEmpty(str29)) {
                                                                            str12 = str29;
                                                                            k0 = 0;
                                                                        } else {
                                                                            str12 = str29;
                                                                            k0 = j02.k0(str12.getBytes(Charset.forName("UTF-8")));
                                                                        }
                                                                        m1 m1Var7 = B0.a.x;
                                                                        o1.m(m1Var7);
                                                                        m1Var7.z();
                                                                        if (k0 != B0.w) {
                                                                            U.b();
                                                                            ((com.google.android.gms.internal.measurement.j3) U.s).Z0();
                                                                        }
                                                                        i2++;
                                                                        str29 = str12;
                                                                    }
                                                                }
                                                                str12 = str29;
                                                                i2++;
                                                                str29 = str12;
                                                            }
                                                            g0 = o4Var.g0();
                                                            j3Var = (com.google.android.gms.internal.measurement.j3) U.e();
                                                            g0.z();
                                                            g0.A();
                                                            c21.u.d(j3Var.p());
                                                            byte[] a4 = j3Var.a();
                                                            long k04 = g0.t.j0().k0(a4);
                                                            ContentValues contentValues2 = new ContentValues();
                                                            contentValues2.put("app_id", j3Var.p());
                                                            contentValues2.put("metadata_fingerprint", Long.valueOf(k04));
                                                            contentValues2.put("metadata", a4);
                                                            g0.o0().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                            g02 = o4Var.g0();
                                                            v vVar2 = (v) sVar2.x;
                                                            Objects.requireNonNull(vVar2);
                                                            it = vVar2.r.keySet().iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    i1 f02 = o4Var.f0();
                                                                    String str33 = (String) sVar2.u;
                                                                    boolean P2 = f02.P(str33, (String) sVar2.v);
                                                                    k D0 = o4Var.g0().D0(o4Var.g(), str33, false, false, false, false);
                                                                    if (!P2 || D0.e >= o4Var.e0().H(str33, c0.p)) {
                                                                        i3 = i;
                                                                    }
                                                                } else if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            }
                                                            i3 = 1;
                                                            g02.z();
                                                            g02.A();
                                                            String str34 = (String) sVar2.u;
                                                            c21.u.d(str34);
                                                            byte[] a5 = g02.t.j0().b0(sVar2).a();
                                                            contentValues = new ContentValues();
                                                            contentValues.put("app_id", str34);
                                                            contentValues.put("name", (String) sVar2.v);
                                                            contentValues.put("timestamp", Long.valueOf(sVar2.s));
                                                            contentValues.put("metadata_fingerprint", Long.valueOf(k04));
                                                            contentValues.put("data", a5);
                                                            contentValues.put("realtime", Integer.valueOf(i3));
                                                            if (g02.o0().insert("raw_events", null, contentValues) != -1) {
                                                                ((o1) ((androidx.compose.foundation.lazy.layout.s0) g02).s).a().D().b(s0.H(str34), "Failed to insert raw event (got -1). appId");
                                                            } else {
                                                                o4Var.F = 0L;
                                                            }
                                                            o4Var.g0().m0();
                                                            o4Var.g0().n0();
                                                            o4Var.N();
                                                            o4Var.a().G().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                                            return;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                o4Var = this;
                                                o4Var.g0().n0();
                                                throw th;
                                            }
                                        }
                                        str11 = str9;
                                        o1Var.q().B();
                                        String str302 = Build.MODEL;
                                        U.l();
                                        o1Var.q().B();
                                        String str312 = Build.VERSION.RELEASE;
                                        U.b();
                                        ((com.google.android.gms.internal.measurement.j3) U.s).o0(str312);
                                        U.o((int) o1Var.q().D());
                                        U.n(o1Var.q().E());
                                        U.V(v4Var.N);
                                        if (o1Var.e()) {
                                        }
                                        B0 = g0().B0(str23);
                                        if (B0 != null) {
                                        }
                                        if (j6.i(a2.ANALYTICS_STORAGE)) {
                                            String E2 = B0.E();
                                            c21.u.g(E2);
                                            U.y(E2);
                                        }
                                        if (!TextUtils.isEmpty(B0.J())) {
                                        }
                                        u0 = o4Var.g0().u0(str23);
                                        i2 = i;
                                        while (i2 < u0.size()) {
                                        }
                                        g0 = o4Var.g0();
                                        j3Var = (com.google.android.gms.internal.measurement.j3) U.e();
                                        g0.z();
                                        g0.A();
                                        c21.u.d(j3Var.p());
                                        byte[] a42 = j3Var.a();
                                        long k042 = g0.t.j0().k0(a42);
                                        ContentValues contentValues22 = new ContentValues();
                                        contentValues22.put("app_id", j3Var.p());
                                        contentValues22.put("metadata_fingerprint", Long.valueOf(k042));
                                        contentValues22.put("metadata", a42);
                                        g0.o0().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                        g02 = o4Var.g0();
                                        v vVar22 = (v) sVar2.x;
                                        Objects.requireNonNull(vVar22);
                                        it = vVar22.r.keySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                            }
                                        }
                                        i3 = 1;
                                        g02.z();
                                        g02.A();
                                        String str342 = (String) sVar2.u;
                                        c21.u.d(str342);
                                        byte[] a52 = g02.t.j0().b0(sVar2).a();
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str342);
                                        contentValues.put("name", (String) sVar2.v);
                                        contentValues.put("timestamp", Long.valueOf(sVar2.s));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(k042));
                                        contentValues.put("data", a52);
                                        contentValues.put("realtime", Integer.valueOf(i3));
                                        if (g02.o0().insert("raw_events", null, contentValues) != -1) {
                                        }
                                        o4Var.g0().m0();
                                        o4Var.g0().n0();
                                        o4Var.N();
                                        o4Var.a().G().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                    str10 = str7;
                                    arrayList = null;
                                    if (arrayList != null) {
                                    }
                                    if (e0().J(null, c0.a1)) {
                                    }
                                    j6 = e(str23).j(b2.c(str13, 100));
                                    if (j6.i(a2Var)) {
                                        r3 r3Var2 = this.z;
                                        r3Var2.getClass();
                                        if (!j6.i(a2Var)) {
                                        }
                                        if (!TextUtils.isEmpty((CharSequence) D.first)) {
                                        }
                                    }
                                    str11 = str9;
                                    o1Var.q().B();
                                    String str3022 = Build.MODEL;
                                    U.l();
                                    o1Var.q().B();
                                    String str3122 = Build.VERSION.RELEASE;
                                    U.b();
                                    ((com.google.android.gms.internal.measurement.j3) U.s).o0(str3122);
                                    U.o((int) o1Var.q().D());
                                    U.n(o1Var.q().E());
                                    U.V(v4Var.N);
                                    if (o1Var.e()) {
                                    }
                                    B0 = g0().B0(str23);
                                    if (B0 != null) {
                                    }
                                    if (j6.i(a2.ANALYTICS_STORAGE)) {
                                    }
                                    if (!TextUtils.isEmpty(B0.J())) {
                                    }
                                    u0 = o4Var.g0().u0(str23);
                                    i2 = i;
                                    while (i2 < u0.size()) {
                                    }
                                    g0 = o4Var.g0();
                                    j3Var = (com.google.android.gms.internal.measurement.j3) U.e();
                                    g0.z();
                                    g0.A();
                                    c21.u.d(j3Var.p());
                                    byte[] a422 = j3Var.a();
                                    long k0422 = g0.t.j0().k0(a422);
                                    ContentValues contentValues222 = new ContentValues();
                                    contentValues222.put("app_id", j3Var.p());
                                    contentValues222.put("metadata_fingerprint", Long.valueOf(k0422));
                                    contentValues222.put("metadata", a422);
                                    g0.o0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                    g02 = o4Var.g0();
                                    v vVar222 = (v) sVar2.x;
                                    Objects.requireNonNull(vVar222);
                                    it = vVar222.r.keySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    i3 = 1;
                                    g02.z();
                                    g02.A();
                                    String str3422 = (String) sVar2.u;
                                    c21.u.d(str3422);
                                    byte[] a522 = g02.t.j0().b0(sVar2).a();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str3422);
                                    contentValues.put("name", (String) sVar2.v);
                                    contentValues.put("timestamp", Long.valueOf(sVar2.s));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(k0422));
                                    contentValues.put("data", a522);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (g02.o0().insert("raw_events", null, contentValues) != -1) {
                                    }
                                    o4Var.g0().m0();
                                    o4Var.g0().n0();
                                    o4Var.N();
                                    o4Var.a().G().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                            }
                            g0.o0().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                            g02 = o4Var.g0();
                            v vVar2222 = (v) sVar2.x;
                            Objects.requireNonNull(vVar2222);
                            it = vVar2222.r.keySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            i3 = 1;
                            g02.z();
                            g02.A();
                            String str34222 = (String) sVar2.u;
                            c21.u.d(str34222);
                            byte[] a5222 = g02.t.j0().b0(sVar2).a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str34222);
                            contentValues.put("name", (String) sVar2.v);
                            contentValues.put("timestamp", Long.valueOf(sVar2.s));
                            contentValues.put("metadata_fingerprint", Long.valueOf(k0422));
                            contentValues.put("data", a5222);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            if (g02.o0().insert("raw_events", null, contentValues) != -1) {
                            }
                            o4Var.g0().m0();
                            o4Var.g0().n0();
                            o4Var.N();
                            o4Var.a().G().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        } catch (SQLiteException e3) {
                            ((o1) ((androidx.compose.foundation.lazy.layout.s0) g0).s).a().D().c("Error storing raw event metadata. appId", s0.H(j3Var.p()), e3);
                            throw e3;
                        }
                        j5 = j4;
                        if (j12 != 0) {
                        }
                        U.R(j7);
                        w0 j03 = j0();
                        com.google.android.gms.internal.measurement.e4 a32 = com.google.android.gms.internal.measurement.e4.a(j03.t.C.d().getContentResolver(), com.google.android.gms.internal.measurement.l4.a(), b21.r.s);
                        if (a32 != null) {
                        }
                        if (b == null) {
                        }
                        str10 = str7;
                        arrayList = null;
                        if (arrayList != null) {
                        }
                        if (e0().J(null, c0.a1)) {
                        }
                        j6 = e(str23).j(b2.c(str13, 100));
                        if (j6.i(a2Var)) {
                        }
                        str11 = str9;
                        o1Var.q().B();
                        String str30222 = Build.MODEL;
                        U.l();
                        o1Var.q().B();
                        String str31222 = Build.VERSION.RELEASE;
                        U.b();
                        ((com.google.android.gms.internal.measurement.j3) U.s).o0(str31222);
                        U.o((int) o1Var.q().D());
                        U.n(o1Var.q().E());
                        U.V(v4Var.N);
                        if (o1Var.e()) {
                        }
                        B0 = g0().B0(str23);
                        if (B0 != null) {
                        }
                        if (j6.i(a2.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(B0.J())) {
                        }
                        u0 = o4Var.g0().u0(str23);
                        i2 = i;
                        while (i2 < u0.size()) {
                        }
                        g0 = o4Var.g0();
                        j3Var = (com.google.android.gms.internal.measurement.j3) U.e();
                        g0.z();
                        g0.A();
                        c21.u.d(j3Var.p());
                        byte[] a4222 = j3Var.a();
                        long k04222 = g0.t.j0().k0(a4222);
                        ContentValues contentValues2222 = new ContentValues();
                        contentValues2222.put("app_id", j3Var.p());
                        contentValues2222.put("metadata_fingerprint", Long.valueOf(k04222));
                        contentValues2222.put("metadata", a4222);
                    }
                    g0().n0();
                }
                z3 = true;
            }
            str = str14;
            str2 = str15;
            String z4 = vVar.z();
            str3 = str16;
            Bundle bundle3 = vVar.r;
            if (z3) {
                double doubleValue = vVar.o().doubleValue() * 1000000.0d;
                if (doubleValue == 0.0d) {
                    str4 = "events";
                    doubleValue = bundle3.getLong("value") * 1000000.0d;
                } else {
                    str4 = "events";
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    a().E().c("Data lost. Currency value is too big. appId", s0.H(str17), Double.valueOf(doubleValue));
                    g0().m0();
                    g0().n0();
                } else {
                    j = Math.round(doubleValue);
                    if ("refund".equals(str21)) {
                        j = -j;
                    }
                }
            } else {
                str4 = "events";
                j = bundle3.getLong("value");
            }
            if (!TextUtils.isEmpty(z4)) {
                String upperCase = z4.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    r4 t02 = g0().t0(str17, concat);
                    if (t02 != null) {
                        Object obj4 = t02.e;
                        if (obj4 instanceof Long) {
                            long longValue = ((Long) obj4).longValue();
                            String str35 = d.t;
                            f().getClass();
                            r4Var = new r4(str17, str35, concat, System.currentTimeMillis(), Long.valueOf(longValue + j));
                            str5 = str17;
                            r4Var2 = r4Var;
                            if (!g0().s0(r4Var2)) {
                                a().D().d("Too many unique user properties are set. Ignoring user property. appId", s0.H(str5), o1Var.n().c(r4Var2.c), r4Var2.e);
                                k0();
                                t4.P(l4Var2, str5, 9, null, null, 0);
                                l4Var = l4Var2;
                                boolean y02 = t4.y0(str21);
                                boolean equals2 = "_err".equals(str21);
                                k0();
                                if (vVar == null) {
                                }
                                String str222 = str5;
                                k E02 = g0().E0(g(), str222, j2 + 1, true, y02, false, equals2, false, false, false);
                                long j142 = E02.b;
                                e0();
                                intValue = j142 - ((Integer) c0.l.a(null)).intValue();
                                if (intValue > 0) {
                                }
                                g0().n0();
                            }
                            l4Var = l4Var2;
                            boolean y022 = t4.y0(str21);
                            boolean equals22 = "_err".equals(str21);
                            k0();
                            if (vVar == null) {
                            }
                            String str2222 = str5;
                            k E022 = g0().E0(g(), str2222, j2 + 1, true, y022, false, equals22, false, false, false);
                            long j1422 = E022.b;
                            e0();
                            intValue = j1422 - ((Integer) c0.l.a(null)).intValue();
                            if (intValue > 0) {
                            }
                            g0().n0();
                        }
                    }
                    o g05 = g0();
                    int H2 = e0().H(str17, c0.T) - 1;
                    c21.u.d(str17);
                    g05.z();
                    g05.A();
                    g05.o0().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str17, str17, String.valueOf(H2)});
                    String str36 = d.t;
                    f().getClass();
                    str5 = str17;
                    r4Var = new r4(str5, str36, concat, System.currentTimeMillis(), Long.valueOf(j));
                    r4Var2 = r4Var;
                    if (!g0().s0(r4Var2)) {
                    }
                    l4Var = l4Var2;
                    boolean y0222 = t4.y0(str21);
                    boolean equals222 = "_err".equals(str21);
                    k0();
                    if (vVar == null) {
                    }
                    String str22222 = str5;
                    k E0222 = g0().E0(g(), str22222, j2 + 1, true, y0222, false, equals222, false, false, false);
                    long j14222 = E0222.b;
                    e0();
                    intValue = j14222 - ((Integer) c0.l.a(null)).intValue();
                    if (intValue > 0) {
                    }
                    g0().n0();
                }
            }
            str5 = str17;
            l4Var = l4Var2;
            boolean y02222 = t4.y0(str21);
            boolean equals2222 = "_err".equals(str21);
            k0();
            if (vVar == null) {
            }
            String str222222 = str5;
            k E02222 = g0().E0(g(), str222222, j2 + 1, true, y02222, false, equals2222, false, false, false);
            long j142222 = E02222.b;
            e0();
            intValue = j142222 - ((Integer) c0.l.a(null)).intValue();
            if (intValue > 0) {
            }
            g0().n0();
        } catch (Throwable th3) {
            th = th3;
            o4Var = this;
        }
    }

    public final void l0() {
        if (!this.D.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void m(x0 x0Var, com.google.android.gms.internal.measurement.i3 i3Var) {
        y51.c cVar;
        com.google.android.gms.internal.measurement.s3 s3Var;
        i iVar;
        b().z();
        l0();
        String B0 = ((com.google.android.gms.internal.measurement.j3) i3Var.s).B0();
        EnumMap enumMap = new EnumMap(a2.class);
        int length = B0.length();
        int length2 = a2.values().length;
        i iVar2 = i.UNSET;
        int i = 0;
        if (length < length2 || B0.charAt(0) != '1') {
            cVar = new y51.c(24);
        } else {
            a2[] values = a2.values();
            int length3 = values.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length3) {
                a2 a2Var = values[i2];
                int i4 = i3 + 1;
                char charAt = B0.charAt(i3);
                i[] values2 = i.values();
                int length4 = values2.length;
                int i5 = i;
                while (true) {
                    if (i5 >= length4) {
                        iVar = iVar2;
                        break;
                    }
                    iVar = values2[i5];
                    if (iVar.r == charAt) {
                        break;
                    } else {
                        i5++;
                    }
                }
                enumMap.put((EnumMap) a2Var, (a2) iVar);
                i2++;
                i3 = i4;
                i = 0;
            }
            cVar = new y51.c(enumMap);
        }
        String D = x0Var.D();
        b().z();
        l0();
        b2 e = e(D);
        EnumMap enumMap2 = e.a;
        a2 a2Var2 = a2.AD_STORAGE;
        y1 y1Var = (y1) enumMap2.get(a2Var2);
        y1 y1Var2 = y1.UNINITIALIZED;
        if (y1Var == null) {
            y1Var = y1Var2;
        }
        int i6 = e.b;
        int ordinal = y1Var.ordinal();
        i iVar3 = i.REMOTE_ENFORCED_DEFAULT;
        i iVar4 = i.FAILSAFE;
        if (ordinal == 1) {
            cVar.r(a2Var2, iVar3);
        } else if (ordinal == 2 || ordinal == 3) {
            cVar.p(a2Var2, i6);
        } else {
            cVar.r(a2Var2, iVar4);
        }
        a2 a2Var3 = a2.ANALYTICS_STORAGE;
        y1 y1Var3 = (y1) enumMap2.get(a2Var3);
        if (y1Var3 != null) {
            y1Var2 = y1Var3;
        }
        int ordinal2 = y1Var2.ordinal();
        if (ordinal2 == 1) {
            cVar.r(a2Var3, iVar3);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            cVar.p(a2Var3, i6);
        } else {
            cVar.r(a2Var3, iVar4);
        }
        String D2 = x0Var.D();
        b().z();
        l0();
        q q0 = q0(D2, o0(D2), e(D2), cVar);
        String str = q0.d;
        Boolean bool = q0.c;
        c21.u.g(bool);
        boolean booleanValue = bool.booleanValue();
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.s).f1(booleanValue);
        if (!TextUtils.isEmpty(str)) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).g1(str);
        }
        b().z();
        l0();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.s).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                s3Var = (com.google.android.gms.internal.measurement.s3) it.next();
                if ("_npa".equals(s3Var.r())) {
                    break;
                }
            } else {
                s3Var = null;
                break;
            }
        }
        if (s3Var != null) {
            EnumMap enumMap3 = (EnumMap) cVar.s;
            a2 a2Var4 = a2.AD_PERSONALIZATION;
            i iVar5 = (i) enumMap3.get(a2Var4);
            if (iVar5 == null) {
                iVar5 = iVar2;
            }
            if (iVar5 == iVar2) {
                o oVar = this.t;
                U(oVar);
                r4 t0 = oVar.t0(x0Var.D(), "_npa");
                i iVar6 = i.MANIFEST;
                i iVar7 = i.API;
                if (t0 != null) {
                    String str2 = t0.b;
                    if ("tcf".equals(str2)) {
                        cVar.r(a2Var4, i.TCF);
                    } else if ("app".equals(str2)) {
                        cVar.r(a2Var4, iVar7);
                    } else {
                        cVar.r(a2Var4, iVar6);
                    }
                } else {
                    Boolean w = x0Var.w();
                    if (w == null || ((w.booleanValue() && s3Var.v() != 1) || !(w.booleanValue() || s3Var.v() == 0))) {
                        cVar.r(a2Var4, iVar7);
                    } else {
                        cVar.r(a2Var4, iVar6);
                    }
                }
            }
        } else {
            int F = F(x0Var.D(), cVar);
            com.google.android.gms.internal.measurement.r3 A = com.google.android.gms.internal.measurement.s3.A();
            A.b();
            ((com.google.android.gms.internal.measurement.s3) A.s).C("_npa");
            f().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            A.b();
            ((com.google.android.gms.internal.measurement.s3) A.s).B(currentTimeMillis);
            A.b();
            ((com.google.android.gms.internal.measurement.s3) A.s).F(F);
            com.google.android.gms.internal.measurement.s3 s3Var2 = (com.google.android.gms.internal.measurement.s3) A.e();
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).d0(s3Var2);
            a().F.c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(F));
        }
        String cVar2 = cVar.toString();
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.s).e1(cVar2);
        String D3 = x0Var.D();
        i1 i1Var = this.r;
        i1Var.z();
        i1Var.F(D3);
        com.google.android.gms.internal.measurement.a2 U = i1Var.U(D3);
        boolean z = U == null || !U.s() || U.t();
        List X = i3Var.X();
        for (int i7 = 0; i7 < X.size(); i7++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.b3) X.get(i7)).s())) {
                com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.b3) X.get(i7)).i();
                List i8 = a3Var.i();
                int i9 = 0;
                while (true) {
                    if (i9 >= i8.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.e3) i8.get(i9)).q())) {
                        String s = ((com.google.android.gms.internal.measurement.e3) i8.get(i9)).s();
                        if (z && s.length() > 4) {
                            char[] charArray = s.toCharArray();
                            int i10 = 1;
                            while (true) {
                                if (i10 >= 64) {
                                    i10 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10)) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            s = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
                        B.i("_tcfd");
                        B.j(s);
                        a3Var.b();
                        ((com.google.android.gms.internal.measurement.b3) a3Var.s).A(i9, (com.google.android.gms.internal.measurement.e3) B.e());
                    } else {
                        i9++;
                    }
                }
                i3Var.Z(i7, a3Var);
                return;
            }
        }
    }

    public final void m0(v4 v4Var) {
        b().z();
        l0();
        String str = v4Var.r;
        c21.u.d(str);
        b2 c = b2.c(v4Var.J, v4Var.O);
        e(str);
        a().F.c("Setting storage consent for package", str, c);
        b().z();
        l0();
        this.S.put(str, c);
        o oVar = this.t;
        U(oVar);
        oVar.U(str, c);
    }

    public final void n(x0 x0Var, com.google.android.gms.internal.measurement.i3 i3Var) {
        Serializable O;
        b().z();
        l0();
        com.google.android.gms.internal.measurement.l2 O2 = com.google.android.gms.internal.measurement.o2.O();
        o1 o1Var = x0Var.a;
        m1 m1Var = o1Var.x;
        o1.m(m1Var);
        m1Var.z();
        byte[] bArr = x0Var.H;
        if (bArr != null) {
            try {
                O2 = (com.google.android.gms.internal.measurement.l2) w0.m0(O2, bArr);
            } catch (zzmr unused) {
                a().A.b(s0.H(x0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = i3Var.X().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) it.next();
            if (b3Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.e3 H = w0.H(b3Var, "gclid");
                Serializable O3 = H == null ? null : w0.O(H);
                if (O3 == null) {
                    O3 = "";
                }
                String str = (String) O3;
                com.google.android.gms.internal.measurement.e3 H2 = w0.H(b3Var, "gbraid");
                Serializable O4 = H2 == null ? null : w0.O(H2);
                if (O4 == null) {
                    O4 = "";
                }
                String str2 = (String) O4;
                com.google.android.gms.internal.measurement.e3 H3 = w0.H(b3Var, "gad_source");
                Object O5 = H3 == null ? null : w0.O(H3);
                String str3 = (String) (O5 != null ? O5 : "");
                String[] split = ((String) c0.g1.a(null)).split(",");
                j0();
                HashMap hashMap = new HashMap();
                for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.p()) {
                    if (Arrays.asList(split).contains(e3Var.q()) && (O = w0.O(e3Var)) != null) {
                        hashMap.put(e3Var.q(), O);
                    }
                }
                if (!hashMap.isEmpty()) {
                    com.google.android.gms.internal.measurement.e3 H4 = w0.H(b3Var, "click_timestamp");
                    Object O6 = H4 == null ? null : w0.O(H4);
                    long longValue = ((Long) (O6 != null ? O6 : 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = b3Var.u();
                    }
                    com.google.android.gms.internal.measurement.e3 H5 = w0.H(b3Var, "_cis");
                    if ("referrer API v2".equals(H5 != null ? w0.O(H5) : null)) {
                        if (longValue > ((com.google.android.gms.internal.measurement.o2) O2.s).N()) {
                            if (str.isEmpty()) {
                                O2.b();
                                ((com.google.android.gms.internal.measurement.o2) O2.s).q();
                            } else {
                                O2.b();
                                ((com.google.android.gms.internal.measurement.o2) O2.s).p(str);
                            }
                            if (str2.isEmpty()) {
                                O2.b();
                                ((com.google.android.gms.internal.measurement.o2) O2.s).s();
                            } else {
                                O2.b();
                                ((com.google.android.gms.internal.measurement.o2) O2.s).r(str2);
                            }
                            if (str3.isEmpty()) {
                                O2.b();
                                ((com.google.android.gms.internal.measurement.o2) O2.s).u();
                            } else {
                                O2.b();
                                ((com.google.android.gms.internal.measurement.o2) O2.s).t(str3);
                            }
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).v(longValue);
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).x().clear();
                            HashMap G = G(b3Var);
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).x().putAll(G);
                        }
                    } else if (longValue > ((com.google.android.gms.internal.measurement.o2) O2.s).F()) {
                        if (str.isEmpty()) {
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).R();
                        } else {
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).Q(str);
                        }
                        if (str2.isEmpty()) {
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).T();
                        } else {
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).S(str2);
                        }
                        if (str3.isEmpty()) {
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).V();
                        } else {
                            O2.b();
                            ((com.google.android.gms.internal.measurement.o2) O2.s).U(str3);
                        }
                        O2.b();
                        ((com.google.android.gms.internal.measurement.o2) O2.s).W(longValue);
                        O2.b();
                        ((com.google.android.gms.internal.measurement.o2) O2.s).w().clear();
                        HashMap G2 = G(b3Var);
                        O2.b();
                        ((com.google.android.gms.internal.measurement.o2) O2.s).w().putAll(G2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.o2) O2.e()).equals(com.google.android.gms.internal.measurement.o2.P())) {
            com.google.android.gms.internal.measurement.o2 o2Var = (com.google.android.gms.internal.measurement.o2) O2.e();
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).k1(o2Var);
        }
        byte[] a = ((com.google.android.gms.internal.measurement.o2) O2.e()).a();
        m1 m1Var2 = o1Var.x;
        o1.m(m1Var2);
        m1Var2.z();
        x0Var.Q |= x0Var.H != a;
        x0Var.H = a;
        if (x0Var.o()) {
            o oVar = this.t;
            U(oVar);
            oVar.C0(x0Var, false);
        }
        if (e0().J(null, c0.f1)) {
            o oVar2 = this.t;
            U(oVar2);
            oVar2.r0(x0Var.D(), "_lgclid");
        }
    }

    public final void n0(v4 v4Var) {
        b().z();
        l0();
        String str = v4Var.r;
        c21.u.d(str);
        q b = q.b(v4Var.P);
        a().F.c("Setting DMA consent for package", str, b);
        b().z();
        l0();
        y1 a = q.c(100, p0(str)).a();
        this.T.put(str, b);
        o oVar = this.t;
        U(oVar);
        c21.u.g(str);
        c21.u.g(b);
        oVar.z();
        oVar.A();
        b2 S = oVar.S(str);
        b2 b2Var = b2.c;
        if (S == b2Var) {
            oVar.U(str, b2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b.b);
        oVar.W(contentValues);
        y1 a2 = q.c(100, p0(str)).a();
        b().z();
        l0();
        y1 y1Var = y1.GRANTED;
        y1 y1Var2 = y1.DENIED;
        boolean z = a == y1Var2 && a2 == y1Var;
        boolean z2 = a == y1Var && a2 == y1Var2;
        if (z || z2) {
            a().F.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            o oVar2 = this.t;
            U(oVar2);
            if (oVar2.D0(g(), str, false, false, false, false).f < e0().H(str, c0.m0)) {
                bundle.putLong("_r", 1L);
                o oVar3 = this.t;
                U(oVar3);
                a().F.c("_dcu realtime event count", str, Long.valueOf(oVar3.D0(g(), str, false, false, true, false).f));
            }
            this.a0.a(str, "_dcu", bundle);
        }
    }

    public final String o(b2 b2Var) {
        if (!b2Var.i(a2.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().x0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final q o0(String str) {
        b().z();
        l0();
        HashMap hashMap = this.T;
        q qVar = (q) hashMap.get(str);
        if (qVar != null) {
            return qVar;
        }
        o oVar = this.t;
        U(oVar);
        c21.u.g(str);
        oVar.z();
        oVar.A();
        q b = q.b(oVar.V("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        hashMap.put(str, b);
        return b;
    }

    public final void p(ArrayList arrayList) {
        c21.u.b(!arrayList.isEmpty());
        if (this.P != null) {
            a().x.a("Set uploading progress before finishing the previous upload");
        } else {
            this.P = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle p0(String str) {
        b().z();
        l0();
        i1 i1Var = this.r;
        U(i1Var);
        if (i1Var.U(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        b2 e = e(str);
        Bundle bundle2 = new Bundle();
        Iterator it = e.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int ordinal = ((y1) entry.getValue()).ordinal();
            String str2 = ordinal != 2 ? ordinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((a2) entry.getKey()).r, str2);
            }
        }
        bundle.putAll(bundle2);
        q q0 = q0(str, o0(str), e, new y51.c(24));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : q0.e.entrySet()) {
            int ordinal2 = ((y1) entry2.getValue()).ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((a2) entry2.getKey()).r, str3);
            }
        }
        Boolean bool = q0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = q0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        o oVar = this.t;
        U(oVar);
        r4 t0 = oVar.t0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (t0 != null ? t0.e.equals(1L) : F(str, new y51.c(24))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a2, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.o4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        o oVar;
        long longValue;
        SQLiteException e;
        b().z();
        l0();
        this.M = true;
        try {
            o1 o1Var = this.C;
            o1Var.getClass();
            Boolean bool = o1Var.p().w;
            if (bool == null) {
                a().A.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().x.a("Upload called in the client side when service should be used");
            } else if (this.F > 0) {
                N();
            } else {
                b().z();
                if (this.P != null) {
                    a().F.a("Uploading requested multiple times");
                } else {
                    w0 w0Var = this.s;
                    U(w0Var);
                    if (w0Var.T()) {
                        f().getClass();
                        Object currentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        r7 = null;
                        Cursor cursor2 = null;
                        r7 = null;
                        r7 = null;
                        String str = null;
                        int H = e0().H(null, c0.i0);
                        e0();
                        long longValue2 = currentTimeMillis - ((Long) c0.e.a(null)).longValue();
                        for (int i = 0; i < H && I(null, longValue2); i++) {
                        }
                        m8.a();
                        b().z();
                        H();
                        long a = this.z.z.a();
                        if (a != 0) {
                            a().E.b(Long.valueOf(Math.abs(currentTimeMillis - a)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        o oVar2 = this.t;
                        U(oVar2);
                        String H2 = oVar2.H();
                        long j = -1;
                        if (TextUtils.isEmpty(H2)) {
                            try {
                                this.R = -1L;
                                oVar = this.t;
                                U(oVar);
                                e0();
                                longValue = currentTimeMillis - ((Long) c0.e.a(null)).longValue();
                                oVar.z();
                                oVar.A();
                            } catch (Throwable th) {
                                th = th;
                                cursor = currentTimeMillis;
                            }
                            try {
                                currentTimeMillis = oVar.o0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                    if (currentTimeMillis.moveToFirst()) {
                                        str = currentTimeMillis.getString(0);
                                    } else {
                                        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s).w;
                                        o1.m(s0Var);
                                        s0Var.F.a("No expired configs for apps with pending events");
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s).w;
                                    o1.m(s0Var2);
                                    s0Var2.x.b(e, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                currentTimeMillis = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                            currentTimeMillis.close();
                            if (!TextUtils.isEmpty(str)) {
                                o oVar3 = this.t;
                                U(oVar3);
                                x0 B0 = oVar3.B0(str);
                                if (B0 != null) {
                                    z(B0);
                                }
                            }
                        } else {
                            if (this.R == -1) {
                                o oVar4 = this.t;
                                U(oVar4);
                                try {
                                    try {
                                        cursor2 = oVar4.o0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursor2.moveToFirst()) {
                                            j = cursor2.getLong(0);
                                        }
                                    } finally {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (SQLiteException e4) {
                                    s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar4).s).w;
                                    o1.m(s0Var3);
                                    s0Var3.x.b(e4, "Error querying raw events");
                                }
                                cursor2.close();
                                this.R = j;
                            }
                            r(H2, currentTimeMillis);
                        }
                    } else {
                        a().F.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.M = false;
            O();
        } catch (Throwable th3) {
            this.M = false;
            O();
            throw th3;
        }
    }

    public final q q0(String str, q qVar, b2 b2Var, y51.c cVar) {
        a2 a2Var;
        y1 D;
        i1 i1Var = this.r;
        U(i1Var);
        com.google.android.gms.internal.measurement.a2 U = i1Var.U(str);
        int i = 90;
        y1 y1Var = y1.DENIED;
        a2 a2Var2 = a2.AD_USER_DATA;
        if (U == null) {
            if (qVar.a() == y1Var) {
                i = qVar.a;
                cVar.p(a2Var2, i);
            } else {
                cVar.r(a2Var2, i.FAILSAFE);
            }
            return new q(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        y1 a = qVar.a();
        y1 y1Var2 = y1.GRANTED;
        if (a == y1Var2 || a == y1Var) {
            i = qVar.a;
            cVar.p(a2Var2, i);
        } else {
            y1 y1Var3 = y1.POLICY;
            y1 y1Var4 = y1.UNINITIALIZED;
            if (a != y1Var3 || (D = i1Var.D(str, a2Var2)) == y1Var4) {
                i1Var.z();
                i1Var.F(str);
                com.google.android.gms.internal.measurement.a2 U2 = i1Var.U(str);
                if (U2 != null) {
                    for (com.google.android.gms.internal.measurement.y1 y1Var5 : U2.q()) {
                        if (a2Var2 == i1.K(y1Var5.p())) {
                            a2Var = i1.K(y1Var5.q());
                            break;
                        }
                    }
                }
                a2Var = null;
                EnumMap enumMap = b2Var.a;
                a2 a2Var3 = a2.AD_STORAGE;
                y1 y1Var6 = (y1) enumMap.get(a2Var3);
                if (y1Var6 != null) {
                    y1Var4 = y1Var6;
                }
                boolean z = y1Var4 == y1Var2 || y1Var4 == y1Var;
                if (a2Var == a2Var3 && z) {
                    cVar.r(a2Var2, i.REMOTE_DELEGATION);
                    a = y1Var4;
                } else {
                    cVar.r(a2Var2, i.REMOTE_DEFAULT);
                    a = true != i1Var.T(str, a2Var2) ? y1Var : y1Var2;
                }
            } else {
                cVar.r(a2Var2, i.REMOTE_ENFORCED_DEFAULT);
                a = D;
            }
        }
        i1Var.z();
        i1Var.F(str);
        com.google.android.gms.internal.measurement.a2 U3 = i1Var.U(str);
        boolean z2 = U3 == null || !U3.s() || U3.t();
        U(i1Var);
        i1Var.z();
        i1Var.F(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.a2 U4 = i1Var.U(str);
        if (U4 != null) {
            Iterator it = U4.r().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.z1) it.next()).p());
            }
        }
        if (a == y1Var || treeSet.isEmpty()) {
            return new q(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new q(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:375:0x0225, code lost:
    
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07f7 A[EDGE_INSN: B:158:0x07f7->B:159:0x07f7 BREAK  A[LOOP:4: B:97:0x064e->B:126:0x07e9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0652  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(String str, long j) {
        Cursor cursor;
        o1 o1Var;
        long j2;
        Cursor cursor2;
        List list;
        List<Pair> list2;
        List list3;
        b2 e;
        a2 a2Var;
        int i;
        List list4;
        com.google.android.gms.internal.measurement.g3 w;
        int size;
        int i2;
        boolean i3;
        boolean J;
        List list5;
        o1 o1Var2;
        boolean z;
        Object obj;
        w0 w0Var;
        String str2;
        j4 j4Var;
        int i4;
        boolean z2;
        int i5;
        List list6;
        boolean z3;
        String str3;
        List list7;
        boolean isEmpty;
        Cursor cursor3;
        o1 o1Var3;
        List list8;
        Cursor cursor4;
        List list9;
        Iterator it;
        Iterator it2;
        int i6;
        int i7;
        SQLiteDatabase o0;
        long currentTimeMillis;
        Cursor query;
        ArrayList arrayList;
        o oVar;
        byte[] byteArray;
        long j3;
        long j4;
        String str4 = str;
        int H = e0().H(str4, c0.h);
        int i8 = 0;
        int max = Math.max(0, e0().H(str4, c0.i));
        o g0 = g0();
        o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) g0).s;
        g0.z();
        g0.A();
        int i9 = 1;
        c21.u.b(H > 0);
        Object r112 = max > 0 ? 1 : 0;
        c21.u.b(r112);
        c21.u.d(str4);
        try {
            try {
                try {
                    j2 = -1;
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                o1Var = o1Var4;
                j2 = -1;
            }
            try {
                cursor2 = g0.o0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str4}, null, null, "rowid", String.valueOf(H));
                try {
                } catch (SQLiteException e3) {
                    e = e3;
                    o1Var = o1Var4;
                }
            } catch (SQLiteException e4) {
                e = e4;
                o1Var = o1Var4;
                cursor2 = null;
                o1Var.a().D().c("Error querying bundles. appId", s0.H(str4), e);
                list = Collections.EMPTY_LIST;
            }
            if (cursor2.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    long j5 = cursor2.getLong(i8);
                    try {
                        byte[] blob = cursor2.getBlob(i9);
                        w0 j0 = g0.t.j0();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            oVar = g0;
                            while (true) {
                                try {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    o1Var = o1Var4;
                                    try {
                                        try {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                            o1Var4 = o1Var;
                                        } catch (IOException e5) {
                                            e = e5;
                                            try {
                                                ((o1) ((androidx.compose.foundation.lazy.layout.s0) j0).s).a().D().b(e, "Failed to ungzip content");
                                                throw e;
                                            } catch (IOException e6) {
                                                e = e6;
                                                o1Var.a().D().c("Failed to unzip queued bundle. appId", s0.H(str4), e);
                                                if (cursor2.moveToNext()) {
                                                    break;
                                                }
                                                g0 = oVar;
                                                o1Var4 = o1Var;
                                                i8 = 0;
                                                i9 = 1;
                                                cursor2.close();
                                                list2 = arrayList2;
                                                if (list2.isEmpty()) {
                                                }
                                            }
                                        }
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        o1Var.a().D().c("Error querying bundles. appId", s0.H(str4), e);
                                        list = Collections.EMPTY_LIST;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    o1Var = o1Var4;
                                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) j0).s).a().D().b(e, "Failed to ungzip content");
                                    throw e;
                                }
                            }
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (IOException e9) {
                            e = e9;
                            oVar = g0;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        oVar = g0;
                        o1Var = o1Var4;
                    }
                    if (!arrayList2.isEmpty() && byteArray.length + i10 > max) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) w0.m0(com.google.android.gms.internal.measurement.j3.U(), byteArray);
                        if (!arrayList2.isEmpty()) {
                            com.google.android.gms.internal.measurement.j3 j3Var = (com.google.android.gms.internal.measurement.j3) ((Pair) arrayList2.get(0)).first;
                            com.google.android.gms.internal.measurement.j3 j3Var2 = (com.google.android.gms.internal.measurement.j3) i3Var.e();
                            if (!j3Var.u0().equals(j3Var2.u0()) || !j3Var.B0().equals(j3Var2.B0()) || j3Var.D0() != j3Var2.D0() || !j3Var.F0().equals(j3Var2.F0())) {
                                break;
                            }
                            Iterator it3 = j3Var.U1().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.s3 s3Var = (com.google.android.gms.internal.measurement.s3) it3.next();
                                Iterator it4 = it3;
                                if ("_npa".equals(s3Var.r())) {
                                    j3 = s3Var.v();
                                    break;
                                }
                                it3 = it4;
                            }
                            Iterator it5 = j3Var2.U1().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    j4 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.s3 s3Var2 = (com.google.android.gms.internal.measurement.s3) it5.next();
                                if ("_npa".equals(s3Var2.r())) {
                                    j4 = s3Var2.v();
                                    break;
                                }
                            }
                            if (j3 != j4) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            int i12 = cursor2.getInt(2);
                            i3Var.b();
                            ((com.google.android.gms.internal.measurement.j3) i3Var.s).T0(i12);
                        }
                        i10 += byteArray.length;
                        arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.j3) i3Var.e(), Long.valueOf(j5)));
                    } catch (IOException e12) {
                        o1Var4.a().D().c("Failed to merge queued bundle. appId", s0.H(str4), e12);
                    }
                    o1Var = o1Var4;
                    if (cursor2.moveToNext() || i10 > max) {
                        break;
                        break;
                    }
                    g0 = oVar;
                    o1Var4 = o1Var;
                    i8 = 0;
                    i9 = 1;
                }
                cursor2.close();
                list2 = arrayList2;
                if (list2.isEmpty()) {
                }
            } else {
                list = Collections.EMPTY_LIST;
                cursor2.close();
                list2 = list;
                if (list2.isEmpty()) {
                    return;
                }
                l7 l7Var = l7.s;
                h e0 = e0();
                b0 b0Var = c0.h1;
                boolean J2 = e0.J(null, b0Var);
                a2 a2Var2 = a2.ANALYTICS_STORAGE;
                if (J2) {
                    if (!e0().J(null, b0Var)) {
                        list7 = list2;
                    } else if (e(str).i(a2Var2) || !f0().E(str4)) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        o g02 = g0();
                        o1 o1Var5 = (o1) ((androidx.compose.foundation.lazy.layout.s0) g02).s;
                        c21.u.d(str4);
                        g02.z();
                        g02.A();
                        ArrayList arrayList4 = new ArrayList();
                        try {
                            try {
                                o0 = g02.o0();
                                o1Var5.f().getClass();
                                currentTimeMillis = System.currentTimeMillis();
                                query = o0.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                o1Var3 = o1Var5;
                            } catch (SQLiteException e13) {
                                e = e13;
                                o1Var3 = o1Var5;
                                list8 = list2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor3 = null;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                        try {
                            try {
                                if (query.moveToFirst()) {
                                    list8 = list2;
                                    while (true) {
                                        try {
                                            try {
                                                arrayList4.add((com.google.android.gms.internal.measurement.b3) ((com.google.android.gms.internal.measurement.a3) w0.m0(com.google.android.gms.internal.measurement.b3.z(), query.getBlob(0))).e());
                                                cursor4 = query;
                                                arrayList = arrayList4;
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                cursor4 = query;
                                                o1Var3.a().D().c("Error flushing NO_DATA mode events. appId", s0.H(str4), e);
                                                list9 = Collections.EMPTY_LIST;
                                                if (cursor4 != null) {
                                                }
                                                it = list8.iterator();
                                                boolean z4 = true;
                                                while (it.hasNext()) {
                                                }
                                                list7 = arrayList3;
                                                isEmpty = list7.isEmpty();
                                                list3 = list7;
                                                if (isEmpty) {
                                                }
                                                e = e(str);
                                                a2Var = a2.AD_STORAGE;
                                                if (e.i(a2Var)) {
                                                }
                                                i = 0;
                                                list4 = list3;
                                                w = com.google.android.gms.internal.measurement.h3.w();
                                                size = list4.size();
                                                ArrayList arrayList5 = new ArrayList(list4.size());
                                                if (e0().A(str4)) {
                                                }
                                                boolean i13 = e(str).i(a2Var);
                                                i3 = e(str).i(a2Var2);
                                                J = e0().J(str4, c0.M0);
                                                k4 k4Var = this.A;
                                                j4 A = k4Var.A(str4);
                                                list5 = list4;
                                                while (true) {
                                                    o1Var2 = this.C;
                                                    if (i < size) {
                                                    }
                                                    i = r23 + 1;
                                                    size = i4;
                                                    i3 = z2;
                                                    list5 = list6;
                                                    i2 = i5;
                                                    J = z3;
                                                }
                                                if (((com.google.android.gms.internal.measurement.h3) w.s).q() != 0) {
                                                }
                                            }
                                        } catch (zzmr e15) {
                                            cursor4 = query;
                                            try {
                                                try {
                                                    arrayList = arrayList4;
                                                    o1Var3.a().C.c("Failed to parse stored NO_DATA mode event, appId", s0.H(str4), e15);
                                                } catch (SQLiteException e16) {
                                                    e = e16;
                                                    o1Var3.a().D().c("Error flushing NO_DATA mode events. appId", s0.H(str4), e);
                                                    list9 = Collections.EMPTY_LIST;
                                                    if (cursor4 != null) {
                                                    }
                                                    it = list8.iterator();
                                                    boolean z42 = true;
                                                    while (it.hasNext()) {
                                                    }
                                                    list7 = arrayList3;
                                                    isEmpty = list7.isEmpty();
                                                    list3 = list7;
                                                    if (isEmpty) {
                                                    }
                                                    e = e(str);
                                                    a2Var = a2.AD_STORAGE;
                                                    if (e.i(a2Var)) {
                                                    }
                                                    i = 0;
                                                    list4 = list3;
                                                    w = com.google.android.gms.internal.measurement.h3.w();
                                                    size = list4.size();
                                                    ArrayList arrayList52 = new ArrayList(list4.size());
                                                    if (e0().A(str4)) {
                                                    }
                                                    boolean i132 = e(str).i(a2Var);
                                                    i3 = e(str).i(a2Var2);
                                                    J = e0().J(str4, c0.M0);
                                                    k4 k4Var2 = this.A;
                                                    j4 A2 = k4Var2.A(str4);
                                                    list5 = list4;
                                                    while (true) {
                                                        o1Var2 = this.C;
                                                        if (i < size) {
                                                        }
                                                        i = r23 + 1;
                                                        size = i4;
                                                        i3 = z2;
                                                        list5 = list6;
                                                        i2 = i5;
                                                        J = z3;
                                                    }
                                                    if (((com.google.android.gms.internal.measurement.h3) w.s).q() != 0) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor3 = cursor4;
                                                if (cursor3 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!cursor4.moveToNext()) {
                                            break;
                                        }
                                        query = cursor4;
                                        arrayList4 = arrayList;
                                    }
                                    cursor4.close();
                                    try {
                                        int delete = o0.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str4, String.valueOf(currentTimeMillis)});
                                        q0 G = o1Var3.a().G();
                                        StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                                        sb.append("Pruned ");
                                        sb.append(delete);
                                        sb.append(" NO_DATA mode events. appId");
                                        G.b(str4, sb.toString());
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        cursor4 = null;
                                        o1Var3.a().D().c("Error flushing NO_DATA mode events. appId", s0.H(str4), e);
                                        list9 = Collections.EMPTY_LIST;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        it = list8.iterator();
                                        boolean z422 = true;
                                        while (it.hasNext()) {
                                        }
                                        list7 = arrayList3;
                                        isEmpty = list7.isEmpty();
                                        list3 = list7;
                                        if (isEmpty) {
                                        }
                                        e = e(str);
                                        a2Var = a2.AD_STORAGE;
                                        if (e.i(a2Var)) {
                                        }
                                        i = 0;
                                        list4 = list3;
                                        w = com.google.android.gms.internal.measurement.h3.w();
                                        size = list4.size();
                                        ArrayList arrayList522 = new ArrayList(list4.size());
                                        if (e0().A(str4)) {
                                        }
                                        boolean i1322 = e(str).i(a2Var);
                                        i3 = e(str).i(a2Var2);
                                        J = e0().J(str4, c0.M0);
                                        k4 k4Var22 = this.A;
                                        j4 A22 = k4Var22.A(str4);
                                        list5 = list4;
                                        while (true) {
                                            o1Var2 = this.C;
                                            if (i < size) {
                                            }
                                            i = r23 + 1;
                                            size = i4;
                                            i3 = z2;
                                            list5 = list6;
                                            i2 = i5;
                                            J = z3;
                                        }
                                        if (((com.google.android.gms.internal.measurement.h3) w.s).q() != 0) {
                                        }
                                    }
                                } else {
                                    arrayList = arrayList4;
                                    list8 = list2;
                                    query.close();
                                }
                                list9 = arrayList;
                            } catch (SQLiteException e18) {
                                e = e18;
                                cursor4 = query;
                                list8 = list2;
                            }
                            it = list8.iterator();
                            boolean z4222 = true;
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                com.google.android.gms.internal.measurement.i3 i3Var2 = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.j3) pair.first).i();
                                if (z4222 && !list9.isEmpty()) {
                                    List X = i3Var2.X();
                                    i3Var2.b();
                                    ((com.google.android.gms.internal.measurement.j3) i3Var2.s).a0();
                                    i3Var2.b();
                                    ((com.google.android.gms.internal.measurement.j3) i3Var2.s).Z(list9);
                                    i3Var2.b();
                                    ((com.google.android.gms.internal.measurement.j3) i3Var2.s).Z(X);
                                    z4222 = false;
                                }
                                com.google.android.gms.internal.measurement.u2 q = com.google.android.gms.internal.measurement.x2.q();
                                com.google.android.gms.internal.measurement.a2 U = f0().U(str4);
                                ArrayList arrayList6 = new ArrayList();
                                if (U != null) {
                                    Iterator it6 = U.p().iterator();
                                    while (it6.hasNext()) {
                                        com.google.android.gms.internal.measurement.x1 x1Var = (com.google.android.gms.internal.measurement.x1) it6.next();
                                        Iterator it7 = it;
                                        com.google.android.gms.internal.measurement.v2 p = com.google.android.gms.internal.measurement.w2.p();
                                        boolean z5 = z4222;
                                        int p2 = x1Var.p() - 1;
                                        List list10 = list9;
                                        if (p2 == 1) {
                                            it2 = it6;
                                            i6 = 3;
                                            i7 = 2;
                                        } else if (p2 != 2) {
                                            it2 = it6;
                                            i6 = 3;
                                            i7 = p2 != 3 ? p2 != 4 ? 1 : 5 : 4;
                                        } else {
                                            it2 = it6;
                                            i6 = 3;
                                            i7 = 3;
                                        }
                                        p.i(i7);
                                        int r = x1Var.r() - 1;
                                        if (r == 1) {
                                            i6 = 2;
                                        } else if (r != 2) {
                                            i6 = 1;
                                        }
                                        p.j(i6);
                                        arrayList6.add((com.google.android.gms.internal.measurement.w2) p.e());
                                        it = it7;
                                        list9 = list10;
                                        z4222 = z5;
                                        it6 = it2;
                                    }
                                }
                                Iterator it8 = it;
                                boolean z6 = z4222;
                                List list11 = list9;
                                q.i(arrayList6);
                                i3Var2.H(q);
                                arrayList3.add(Pair.create((com.google.android.gms.internal.measurement.j3) i3Var2.e(), (Long) pair.second));
                                it = it8;
                                list9 = list11;
                                z4222 = z6;
                            }
                            list7 = arrayList3;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor4 = query;
                            cursor3 = cursor4;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        List asList = Arrays.asList(((String) c0.i1.a(null)).split(","));
                        for (Pair pair2 : list2) {
                            try {
                                g0().I(((Long) pair2.second).longValue());
                                for (com.google.android.gms.internal.measurement.b3 b3Var : ((com.google.android.gms.internal.measurement.j3) pair2.first).P1()) {
                                    if (asList.contains(b3Var.s())) {
                                        if (b3Var.s().equals("_f") || b3Var.s().equals("_v")) {
                                            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) b3Var.i();
                                            j0();
                                            w0.F(a3Var, "_dac", 1L);
                                            b3Var = (com.google.android.gms.internal.measurement.b3) a3Var.e();
                                        }
                                        o g03 = g0();
                                        g03.z();
                                        g03.A();
                                        c21.u.d(str4);
                                        o1 o1Var6 = (o1) ((androidx.compose.foundation.lazy.layout.s0) g03).s;
                                        o1Var6.a().G().b(b3Var, "Caching events in NO_DATA mode");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str4);
                                        com.google.android.gms.internal.measurement.b3 b3Var2 = b3Var;
                                        contentValues.put("name", b3Var2.s());
                                        contentValues.put("data", b3Var2.a());
                                        contentValues.put("timestamp_millis", Long.valueOf(b3Var2.u()));
                                        try {
                                            if (g03.o0().insert("no_data_mode_events", null, contentValues) == j2) {
                                                o1Var6.a().D().b(s0.H(str4), "Failed to insert NO_DATA mode event (got -1). appId");
                                            }
                                        } catch (SQLiteException e19) {
                                            ((o1) ((androidx.compose.foundation.lazy.layout.s0) g03).s).a().D().c("Error storing NO_DATA mode event. appId", s0.H(str4), e19);
                                        }
                                    }
                                }
                            } catch (SQLiteException unused) {
                                a().C.b(str4, "Failed handling NO_DATA mode bundles. appId");
                            }
                        }
                        list7 = Collections.EMPTY_LIST;
                    }
                    isEmpty = list7.isEmpty();
                    list3 = list7;
                    if (isEmpty) {
                        return;
                    }
                } else {
                    list3 = list2;
                }
                e = e(str);
                a2Var = a2.AD_STORAGE;
                if (e.i(a2Var)) {
                    Iterator it9 = list3.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            str3 = null;
                            break;
                        }
                        com.google.android.gms.internal.measurement.j3 j3Var3 = (com.google.android.gms.internal.measurement.j3) ((Pair) it9.next()).first;
                        if (!j3Var3.v().isEmpty()) {
                            str3 = j3Var3.v();
                            break;
                        }
                    }
                    if (str3 != null) {
                        for (int i14 = 0; i14 < list3.size(); i14++) {
                            com.google.android.gms.internal.measurement.j3 j3Var4 = (com.google.android.gms.internal.measurement.j3) ((Pair) list3.get(i14)).first;
                            if (!j3Var4.v().isEmpty() && !j3Var4.v().equals(str3)) {
                                i = 0;
                                list4 = list3.subList(0, i14);
                                break;
                            }
                        }
                    }
                }
                i = 0;
                list4 = list3;
                w = com.google.android.gms.internal.measurement.h3.w();
                size = list4.size();
                ArrayList arrayList5222 = new ArrayList(list4.size());
                i2 = (e0().A(str4) || !e(str).i(a2Var)) ? i : 1;
                boolean i13222 = e(str).i(a2Var);
                i3 = e(str).i(a2Var2);
                J = e0().J(str4, c0.M0);
                k4 k4Var222 = this.A;
                j4 A222 = k4Var222.A(str4);
                list5 = list4;
                while (true) {
                    o1Var2 = this.C;
                    if (i < size) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.i3 i3Var3 = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.j3) ((Pair) list5.get(i)).first).i();
                    int i15 = i;
                    arrayList5222.add((Long) ((Pair) list5.get(i)).second);
                    e0().E();
                    i3Var3.v();
                    i3Var3.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var3.s).f0(j);
                    o1Var2.getClass();
                    i3Var3.L();
                    if (i2 == 0) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).S0();
                    }
                    if (!i13222) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).z1();
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).B1();
                    }
                    if (!i3) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).D1();
                    }
                    v(i3Var3, str4);
                    if (!J) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).Z0();
                    }
                    if (!i3) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).L1();
                    }
                    String v = ((com.google.android.gms.internal.measurement.j3) i3Var3.s).v();
                    if (TextUtils.isEmpty(v)) {
                        i4 = size;
                    } else {
                        i4 = size;
                        if (!v.equals("00000000-0000-0000-0000-000000000000")) {
                            z2 = i3;
                            i5 = i2;
                            list6 = list5;
                            z3 = J;
                            if (i3Var3.Y() != 0) {
                                if (e0().J(str4, c0.C0)) {
                                    i3Var3.S(j0().k0(((com.google.android.gms.internal.measurement.j3) i3Var3.e()).a()));
                                }
                                com.google.android.gms.internal.measurement.q3 b = A222.b();
                                if (b != null) {
                                    i3Var3.E(b);
                                }
                                w.b();
                                ((com.google.android.gms.internal.measurement.h3) w.s).z((com.google.android.gms.internal.measurement.j3) i3Var3.e());
                            }
                            i = i15 + 1;
                            size = i4;
                            i3 = z2;
                            list5 = list6;
                            i2 = i5;
                            J = z3;
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(i3Var3.X());
                    Iterator it10 = arrayList7.iterator();
                    z2 = i3;
                    Long l = null;
                    Long l2 = null;
                    boolean z7 = false;
                    boolean z8 = false;
                    while (it10.hasNext()) {
                        int i16 = i2;
                        com.google.android.gms.internal.measurement.b3 b3Var3 = (com.google.android.gms.internal.measurement.b3) it10.next();
                        List list12 = list5;
                        boolean z9 = J;
                        if ("_fx".equals(b3Var3.s())) {
                            it10.remove();
                            list5 = list12;
                            i2 = i16;
                            J = z9;
                            z7 = true;
                        } else if ("_f".equals(b3Var3.s())) {
                            j0();
                            com.google.android.gms.internal.measurement.e3 H2 = w0.H(b3Var3, "_pfo");
                            if (H2 != null) {
                                l = Long.valueOf(H2.u());
                            }
                            j0();
                            com.google.android.gms.internal.measurement.e3 H3 = w0.H(b3Var3, "_uwa");
                            if (H3 != null) {
                                l2 = Long.valueOf(H3.u());
                            }
                            list5 = list12;
                            i2 = i16;
                            J = z9;
                        } else {
                            list5 = list12;
                            i2 = i16;
                            J = z9;
                        }
                        z8 = true;
                    }
                    i5 = i2;
                    list6 = list5;
                    z3 = J;
                    if (z7) {
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).a0();
                        i3Var3.b();
                        ((com.google.android.gms.internal.measurement.j3) i3Var3.s).Z(arrayList7);
                    }
                    if (z8) {
                        u(i3Var3.q(), true, l, l2);
                    }
                    if (i3Var3.Y() != 0) {
                    }
                    i = i15 + 1;
                    size = i4;
                    i3 = z2;
                    list5 = list6;
                    i2 = i5;
                    J = z3;
                }
                if (((com.google.android.gms.internal.measurement.h3) w.s).q() != 0) {
                    p(arrayList5222);
                    y(false, 204, null, null, str4, Collections.EMPTY_LIST);
                    return;
                }
                com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) w.e();
                ArrayList arrayList8 = new ArrayList();
                a3 a3Var2 = A222.c;
                boolean z10 = a3Var2 == a3.v;
                if (a3Var2 == a3.u) {
                    z = z10;
                } else {
                    if (!z10) {
                        obj = null;
                        w0Var = this.s;
                        U(w0Var);
                        if (w0Var.T()) {
                            return;
                        }
                        Object c0 = Log.isLoggable(a().J(), 2) ? j0().c0(h3Var) : obj;
                        j0();
                        byte[] a = h3Var.a();
                        p(arrayList5222);
                        this.z.A.b(j);
                        a().G().d("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(a.length), c0);
                        this.L = true;
                        U(w0Var);
                        w0Var.Y(str4, A222, h3Var, new a5.s(this, str4, arrayList8, 14));
                        return;
                    }
                    z = true;
                }
                Iterator it11 = ((com.google.android.gms.internal.measurement.h3) w.e()).p().iterator();
                while (true) {
                    if (it11.hasNext()) {
                        if (((com.google.android.gms.internal.measurement.j3) it11.next()).N()) {
                            str2 = UUID.randomUUID().toString();
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                com.google.android.gms.internal.measurement.h3 h3Var2 = (com.google.android.gms.internal.measurement.h3) w.e();
                b().z();
                l0();
                com.google.android.gms.internal.measurement.g3 x = com.google.android.gms.internal.measurement.h3.x(h3Var2);
                if (!TextUtils.isEmpty(str2)) {
                    x.b();
                    ((com.google.android.gms.internal.measurement.h3) x.s).C(str2);
                }
                String M = f0().M(str4);
                if (!TextUtils.isEmpty(M)) {
                    x.j(M);
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it12 = h3Var2.p().iterator();
                while (it12.hasNext()) {
                    com.google.android.gms.internal.measurement.i3 V = com.google.android.gms.internal.measurement.j3.V((com.google.android.gms.internal.measurement.j3) it12.next());
                    V.b();
                    ((com.google.android.gms.internal.measurement.j3) V.s).S0();
                    arrayList9.add((com.google.android.gms.internal.measurement.j3) V.e());
                }
                x.b();
                ((com.google.android.gms.internal.measurement.h3) x.s).B();
                x.b();
                ((com.google.android.gms.internal.measurement.h3) x.s).A(arrayList9);
                a().G().b(TextUtils.isEmpty(str2) ? "null" : x.i(), "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                com.google.android.gms.internal.measurement.h3 h3Var3 = (com.google.android.gms.internal.measurement.h3) x.e();
                if (TextUtils.isEmpty(str2)) {
                    obj = null;
                } else {
                    com.google.android.gms.internal.measurement.h3 h3Var4 = (com.google.android.gms.internal.measurement.h3) w.e();
                    b().z();
                    l0();
                    com.google.android.gms.internal.measurement.g3 w2 = com.google.android.gms.internal.measurement.h3.w();
                    a().G().b(str2, "[sgtm] Processing Google Signal, sgtmJoinId:");
                    w2.b();
                    ((com.google.android.gms.internal.measurement.h3) w2.s).C(str2);
                    for (com.google.android.gms.internal.measurement.j3 j3Var5 : h3Var4.p()) {
                        com.google.android.gms.internal.measurement.i3 U2 = com.google.android.gms.internal.measurement.j3.U();
                        String O = j3Var5.O();
                        U2.b();
                        ((com.google.android.gms.internal.measurement.j3) U2.s).R0(O);
                        int K0 = j3Var5.K0();
                        U2.b();
                        ((com.google.android.gms.internal.measurement.j3) U2.s).j1(K0);
                        w2.b();
                        ((com.google.android.gms.internal.measurement.h3) w2.s).z((com.google.android.gms.internal.measurement.j3) U2.e());
                    }
                    com.google.android.gms.internal.measurement.h3 h3Var5 = (com.google.android.gms.internal.measurement.h3) w2.e();
                    String M2 = k4Var222.t.f0().M(str4);
                    boolean isEmpty2 = TextUtils.isEmpty(M2);
                    a3 a3Var3 = a3.t;
                    a3 a3Var4 = a3.w;
                    if (isEmpty2) {
                        obj = null;
                        String str5 = (String) c0.s.a(null);
                        if (z) {
                            a3Var3 = a3Var4;
                        }
                        j4Var = new j4(str5, Collections.EMPTY_MAP, a3Var3, null);
                    } else {
                        Uri parse = Uri.parse((String) c0.s.a(null));
                        Uri.Builder buildUpon = parse.buildUpon();
                        String authority = parse.getAuthority();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(M2).length() + 1 + String.valueOf(authority).length());
                        sb2.append(M2);
                        sb2.append(".");
                        sb2.append(authority);
                        buildUpon.authority(sb2.toString());
                        String uri = buildUpon.build().toString();
                        if (z) {
                            a3Var3 = a3Var4;
                        }
                        obj = null;
                        j4Var = new j4(uri, Collections.EMPTY_MAP, a3Var3, null);
                    }
                    arrayList8.add(Pair.create(h3Var5, j4Var));
                }
                if (z) {
                    com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) h3Var3.i();
                    for (int i17 = 0; i17 < h3Var3.q(); i17++) {
                        com.google.android.gms.internal.measurement.i3 i3Var4 = (com.google.android.gms.internal.measurement.i3) h3Var3.r(i17).i();
                        i3Var4.d0();
                        i3Var4.F(j);
                        g3Var.b();
                        ((com.google.android.gms.internal.measurement.h3) g3Var.s).y(i17, (com.google.android.gms.internal.measurement.j3) i3Var4.e());
                    }
                    arrayList8.add(Pair.create((com.google.android.gms.internal.measurement.h3) g3Var.e(), A222));
                    p(arrayList5222);
                    y(false, 204, null, null, str, arrayList8);
                    if (s(str, A222.a())) {
                        a().G().b(str, "[sgtm] Sending sgtm batches available notification to app");
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent.setPackage(str);
                        S(o1Var2.d(), intent);
                        return;
                    }
                    return;
                }
                str4 = str;
                h3Var = h3Var3;
                w0Var = this.s;
                U(w0Var);
                if (w0Var.T()) {
                }
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = r112;
        }
    }

    public final boolean s(String str, String str2) {
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str);
        HashMap hashMap = this.V;
        if (B0 != null && k0().a0(str, B0.C())) {
            hashMap.remove(str2);
            return true;
        }
        n4 n4Var = (n4) hashMap.get(str2);
        if (n4Var != null) {
            n4Var.a.f().getClass();
            if (System.currentTimeMillis() < n4Var.c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        b().z();
        l0();
        this.M = true;
        try {
            o1 o1Var = this.C;
            o1Var.getClass();
            Boolean bool = o1Var.p().w;
            if (bool == null) {
                a().A.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().x.a("Upload called in the client side when service should be used");
            } else if (this.F > 0) {
                N();
            } else {
                w0 w0Var = this.s;
                U(w0Var);
                if (w0Var.T()) {
                    o oVar = this.t;
                    U(oVar);
                    if (oVar.F(str)) {
                        o oVar2 = this.t;
                        U(oVar2);
                        c21.u.d(str);
                        oVar2.z();
                        oVar2.A();
                        List E = oVar2.E(str, g4.j(a3.t), 1);
                        p4 p4Var = E.isEmpty() ? null : (p4) E.get(0);
                        if (p4Var != null) {
                            com.google.android.gms.internal.measurement.h3 h3Var = p4Var.b;
                            a().F.d("[sgtm] Uploading data from upload queue. appId, type, url", str, p4Var.e, p4Var.c);
                            byte[] a = h3Var.a();
                            if (Log.isLoggable(a().J(), 2)) {
                                w0 w0Var2 = this.x;
                                U(w0Var2);
                                a().F.d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(a.length), w0Var2.c0(h3Var));
                            }
                            j4 j4Var = new j4(p4Var.c, p4Var.d, p4Var.e, null);
                            this.L = true;
                            w0 w0Var3 = this.s;
                            U(w0Var3);
                            w0Var3.Y(str, j4Var, h3Var, new a5.s(this, str, p4Var, 15));
                        }
                    } else {
                        a().F.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().F.a("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.M = false;
            O();
        } catch (Throwable th) {
            this.M = false;
            O();
            throw th;
        }
    }

    public final void u(String str, boolean z, Long l, Long l2) {
        o oVar = this.t;
        U(oVar);
        x0 B0 = oVar.B0(str);
        if (B0 != null) {
            o1 o1Var = B0.a;
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.z();
            B0.Q |= B0.y != z;
            B0.y = z;
            m1 m1Var2 = o1Var.x;
            o1.m(m1Var2);
            m1Var2.z();
            B0.Q |= !Objects.equals(B0.z, l);
            B0.z = l;
            m1 m1Var3 = o1Var.x;
            o1.m(m1Var3);
            m1Var3.z();
            B0.Q |= !Objects.equals(B0.A, l2);
            B0.A = l2;
            if (B0.o()) {
                o oVar2 = this.t;
                U(oVar2);
                oVar2.C0(B0, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011f, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(com.google.android.gms.internal.measurement.i3 i3Var, String str) {
        int n0;
        int indexOf;
        i1 i1Var = this.r;
        U(i1Var);
        i1Var.z();
        i1Var.F(str);
        x.e eVar = i1Var.w;
        Set set = (Set) eVar.get(str);
        if (set != null) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).a1(set);
        }
        U(i1Var);
        i1Var.z();
        i1Var.F(str);
        if (eVar.get(str) != null && (((Set) eVar.get(str)).contains("device_model") || ((Set) eVar.get(str)).contains("device_info"))) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).q1();
        }
        U(i1Var);
        if (i1Var.R(str)) {
            String i2 = ((com.google.android.gms.internal.measurement.j3) i3Var.s).i2();
            if (!TextUtils.isEmpty(i2) && (indexOf = i2.indexOf(".")) != -1) {
                String substring = i2.substring(0, indexOf);
                i3Var.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var.s).o0(substring);
            }
        }
        U(i1Var);
        i1Var.z();
        i1Var.F(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("user_id") && (n0 = w0.n0(i3Var, "_id")) != -1) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).e0(n0);
        }
        U(i1Var);
        i1Var.z();
        i1Var.F(str);
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("google_signals")) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).S0();
        }
        U(i1Var);
        if (i1Var.S(str)) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.s).D1();
            if (e(str).i(a2.ANALYTICS_STORAGE)) {
                HashMap hashMap = this.U;
                m4 m4Var = (m4) hashMap.get(str);
                if (m4Var != null) {
                    long G = e0().G(str, c0.k0) + m4Var.b;
                    f().getClass();
                }
                m4Var = new m4(this, k0().s0());
                hashMap.put(str, m4Var);
                String str2 = m4Var.a;
                i3Var.b();
                ((com.google.android.gms.internal.measurement.j3) i3Var.s).b1(str2);
            }
        }
        U(i1Var);
        i1Var.z();
        i1Var.F(str);
        if (eVar.get(str) == null || !((Set) eVar.get(str)).contains("enhanced_user_id")) {
            return;
        }
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.s).Z0();
    }

    public final void w(com.google.android.gms.internal.measurement.i3 i3Var, b1 b1Var) {
        String str;
        String str2;
        for (int i = 0; i < i3Var.Y(); i++) {
            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.j3) i3Var.s).T1(i).i();
            Iterator it = a3Var.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.e3) it.next()).q())) {
                    if (((com.google.android.gms.internal.measurement.j3) b1Var.b).G0() >= e0().H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.l0)) {
                        int H = e0().H(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.y0);
                        LinkedList linkedList = this.H;
                        w0 w0Var = this.x;
                        if (H > 0) {
                            o oVar = this.t;
                            U(oVar);
                            if (oVar.D0(g(), ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), false, false, false, true).g > H) {
                                com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
                                B.i("_tnr");
                                B.k(1L);
                                a3Var.l((com.google.android.gms.internal.measurement.e3) B.e());
                            } else {
                                if (e0().J(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.R0)) {
                                    str2 = k0().s0();
                                    com.google.android.gms.internal.measurement.d3 B2 = com.google.android.gms.internal.measurement.e3.B();
                                    B2.i("_tu");
                                    B2.j(str2);
                                    a3Var.l((com.google.android.gms.internal.measurement.e3) B2.e());
                                } else {
                                    str2 = null;
                                }
                                com.google.android.gms.internal.measurement.d3 B3 = com.google.android.gms.internal.measurement.e3.B();
                                B3.i("_tr");
                                B3.k(1L);
                                a3Var.l((com.google.android.gms.internal.measurement.e3) B3.e());
                                U(w0Var);
                                c4 a0 = w0Var.a0(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), i3Var, a3Var, str2);
                                if (a0 != null) {
                                    a().F.c("Generated trigger URI. appId, uri", ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a0.r);
                                    o oVar2 = this.t;
                                    U(oVar2);
                                    oVar2.T(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a0);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.j3) b1Var.b).p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                                    }
                                }
                            }
                        } else {
                            if (e0().J(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), c0.R0)) {
                                str = k0().s0();
                                com.google.android.gms.internal.measurement.d3 B4 = com.google.android.gms.internal.measurement.e3.B();
                                B4.i("_tu");
                                B4.j(str);
                                a3Var.l((com.google.android.gms.internal.measurement.e3) B4.e());
                            } else {
                                str = null;
                            }
                            com.google.android.gms.internal.measurement.d3 B5 = com.google.android.gms.internal.measurement.e3.B();
                            B5.i("_tr");
                            B5.k(1L);
                            a3Var.l((com.google.android.gms.internal.measurement.e3) B5.e());
                            U(w0Var);
                            c4 a02 = w0Var.a0(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), i3Var, a3Var, str);
                            if (a02 != null) {
                                a().F.c("Generated trigger URI. appId, uri", ((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a02.r);
                                o oVar3 = this.t;
                                U(oVar3);
                                oVar3.T(((com.google.android.gms.internal.measurement.j3) b1Var.b).p(), a02);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.j3) b1Var.b).p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.j3) b1Var.b).p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) a3Var.e();
                    i3Var.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var.s).X(i, b3Var);
                }
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.d3 d3Var, Bundle bundle, String str2) {
        int max;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (t4.Y(((com.google.android.gms.internal.measurement.e3) d3Var.s).q()) || t4.Y(str)) {
            h e0 = e0();
            e0.getClass();
            max = Math.max(Math.max(Math.min(e0.H(str2, c0.h0), 500), 100), 256);
        } else {
            h e02 = e0();
            e02.getClass();
            max = Math.max(Math.min(e02.H(str2, c0.h0), 500), 100);
        }
        long j = max;
        long codePointCount = ((com.google.android.gms.internal.measurement.e3) d3Var.s).s().codePointCount(0, ((com.google.android.gms.internal.measurement.e3) d3Var.s).s().length());
        k0();
        String q = ((com.google.android.gms.internal.measurement.e3) d3Var.s).q();
        e0();
        String E = t4.E(40, q, true);
        if (codePointCount <= j || unmodifiableList.contains(((com.google.android.gms.internal.measurement.e3) d3Var.s).q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.e3) d3Var.s).q())) {
            k0();
            String s = ((com.google.android.gms.internal.measurement.e3) d3Var.s).s();
            h e03 = e0();
            e03.getClass();
            bundle.putString("_ev", t4.E(Math.max(Math.max(Math.min(e03.H(str2, c0.h0), 500), 100), 256), s, true));
            return;
        }
        a().C.c("Param value is too long; discarded. Name, value length", E, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", E);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.e3) d3Var.s).q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r20 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        a3 a3Var;
        int i2 = i;
        w0 w0Var = this.s;
        b().z();
        l0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.L = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList arrayList = this.P;
        c21.u.g(arrayList);
        this.P = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    a().C.d("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
                    a1 a1Var = this.z.A;
                    f().getClass();
                    a1Var.b(System.currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        a1 a1Var2 = this.z.y;
                        f().getClass();
                        a1Var2.b(System.currentTimeMillis());
                    }
                    o oVar = this.t;
                    U(oVar);
                    oVar.K(arrayList);
                    N();
                    this.L = false;
                    O();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                a3Var = a3.v;
                if (!hasNext) {
                    break;
                }
                Pair pair = (Pair) it.next();
                com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) pair.first;
                j4 j4Var = (j4) pair.second;
                a3 a3Var2 = j4Var.c;
                a3 a3Var3 = j4Var.c;
                if (a3Var2 != a3Var) {
                    o oVar2 = this.t;
                    U(oVar2);
                    String str3 = j4Var.a;
                    Map map = j4Var.b;
                    if (map == null) {
                        map = Collections.EMPTY_MAP;
                    }
                    long D = oVar2.D(str, h3Var, str3, map, a3Var3, null);
                    if (a3Var3 == a3.w && D != -1 && !h3Var.t().isEmpty()) {
                        hashMap.put(h3Var.t(), Long.valueOf(D));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                com.google.android.gms.internal.measurement.h3 h3Var2 = (com.google.android.gms.internal.measurement.h3) pair2.first;
                j4 j4Var2 = (j4) pair2.second;
                if (j4Var2.c == a3Var) {
                    Long l = (Long) hashMap.get(h3Var2.t());
                    o oVar3 = this.t;
                    U(oVar3);
                    a3 a3Var4 = a3Var;
                    String str4 = j4Var2.a;
                    Map map2 = j4Var2.b;
                    if (map2 == null) {
                        map2 = Collections.EMPTY_MAP;
                    }
                    oVar3.D(str, h3Var2, str4, map2, j4Var2.c, l);
                    a3Var = a3Var4;
                }
            }
            o oVar4 = this.t;
            U(oVar4);
            List E = oVar4.E(str, g4.j(a3Var), 1);
            if (!E.isEmpty()) {
                long j = ((p4) E.get(0)).f;
                f().getClass();
                if (System.currentTimeMillis() > ((Long) c0.F.a(null)).longValue() + j) {
                    a().A.c("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(j));
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                Long l2 = (Long) arrayList.get(i3);
                try {
                    o oVar5 = this.t;
                    U(oVar5);
                    oVar5.I(l2.longValue());
                } catch (SQLiteException e) {
                    ArrayList arrayList2 = this.Q;
                    if (arrayList2 == null || !arrayList2.contains(l2)) {
                        throw e;
                    }
                }
                i3 = i4;
            }
            o oVar6 = this.t;
            U(oVar6);
            oVar6.m0();
            o oVar7 = this.t;
            U(oVar7);
            oVar7.n0();
            this.Q = null;
            U(w0Var);
            if (w0Var.T()) {
                o oVar8 = this.t;
                U(oVar8);
                if (oVar8.F(str)) {
                    t(str);
                    this.F = 0L;
                    this.L = false;
                    O();
                    return;
                }
            }
            U(w0Var);
            if (w0Var.T() && L()) {
                q();
            } else {
                this.R = -1L;
                N();
            }
            this.F = 0L;
            this.L = false;
            O();
            return;
        } catch (Throwable th3) {
            o oVar9 = this.t;
            U(oVar9);
            oVar9.n0();
            throw th3;
        }
        q0 q0Var = a().F;
        Integer valueOf = Integer.valueOf(i2);
        q0Var.c("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z));
        if (z) {
            try {
                a1 a1Var3 = this.z.z;
                f().getClass();
                a1Var3.b(System.currentTimeMillis());
            } catch (SQLiteException e2) {
                a().x.b(e2, "Database error while trying to delete uploaded bundles");
                f().getClass();
                this.F = SystemClock.elapsedRealtime();
                a().F.b(Long.valueOf(this.F), "Disable upload, time");
            }
        }
        this.z.A.b(0L);
        N();
        if (z) {
            a().F.c("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            a().F.a("Purged empty bundles");
        }
        o oVar10 = this.t;
        U(oVar10);
        oVar10.l0();
    }

    public final void z(x0 x0Var) {
        x.e eVar;
        x.e eVar2;
        b().z();
        if (TextUtils.isEmpty(x0Var.G())) {
            String D = x0Var.D();
            c21.u.g(D);
            A(D, 204, null, null, null);
            return;
        }
        String D2 = x0Var.D();
        c21.u.g(D2);
        a().F.b(D2, "Fetching remote configuration");
        i1 i1Var = this.r;
        U(i1Var);
        com.google.android.gms.internal.measurement.f2 L = i1Var.L(D2);
        U(i1Var);
        i1Var.z();
        String str = (String) i1Var.E.get(D2);
        if (L != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new x.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            U(i1Var);
            i1Var.z();
            String str2 = (String) i1Var.F.get(D2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new x.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.K = true;
        w0 w0Var = this.s;
        U(w0Var);
        l4 l4Var = new l4(this);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) w0Var).s;
        w0Var.z();
        w0Var.A();
        k4 k4Var = w0Var.t.A;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) c0.f.a(null)).encodedAuthority((String) c0.g.a(null)).path("config/app/".concat(String.valueOf(x0Var.G()))).appendQueryParameter("platform", "android");
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) k4Var).s).u.E();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            URL url = new URI(uri).toURL();
            m1 m1Var = o1Var.x;
            o1.m(m1Var);
            m1Var.L(new v0(w0Var, x0Var.D(), url, (byte[]) null, (Map) eVar, (u0) l4Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.c("Failed to parse config URL. Not fetching. appId", s0.H(x0Var.D()), uri);
        }
    }
    public Object CREATOR = null;
}
