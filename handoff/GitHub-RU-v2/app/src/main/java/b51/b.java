package b51;

import f1.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import v41.i;
import y41.j2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final z41.c g = new z41.c();
    public static final androidx.compose.foundation.lazy.layout.a h = new androidx.compose.foundation.lazy.layout.a(3);
    public static final a i = new a(0);
    public final AtomicInteger a = new AtomicInteger(0);
    public d b;
    public d51.d c;
    public i d;

    public b(d dVar, d51.d dVar2, i iVar) {
        this.b = dVar;
        this.c = dVar2;
        this.d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.b;
        arrayList.addAll(d.k(((File) dVar.f).listFiles()));
        arrayList.addAll(d.k(((File) dVar.g).listFiles()));
        androidx.compose.foundation.lazy.layout.a aVar = h;
        Collections.sort(arrayList, aVar);
        List k = d.k(((File) dVar.e).listFiles());
        Collections.sort(k, aVar);
        arrayList.addAll(k);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(d.k(((File) this.b.d).list())).descendingSet();
    }

    public final void d(j2 j2Var, String str, boolean z) {
        d dVar = this.b;
        int i2 = this.c.c().a.r;
        g.getClass();
        try {
            f(dVar.f(str, e.z("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), z41.c.a.o(j2Var));
        } catch (IOException unused) {
        }
        a aVar = new a(1);
        dVar.getClass();
        File file = new File((File) dVar.d, str);
        file.mkdirs();
        List<File> k = d.k(file.listFiles(aVar));
        Collections.sort(k, new androidx.compose.foundation.lazy.layout.a(4));
        int size = k.size();
        for (File file2 : k) {
            if (size <= i2) {
                return;
            }
            d.j(file2);
            size--;
        }
    }
}
