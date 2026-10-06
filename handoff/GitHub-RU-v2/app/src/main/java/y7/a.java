package y7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f34278e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public boolean f34279a;

    /* renamed from: b, reason: collision with root package name */
    public File f34280b;

    /* renamed from: c, reason: collision with root package name */
    public Lock f34281c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f34282d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f34279a = z10;
        this.f34280b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f34278e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f34281c = lock;
    }

    public final void a(boolean z10) {
        this.f34281c.lock();
        if (z10) {
            File file = this.f34280b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f34282d = channel;
            } catch (IOException unused) {
                this.f34282d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f34282d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f34281c.unlock();
    }
}
