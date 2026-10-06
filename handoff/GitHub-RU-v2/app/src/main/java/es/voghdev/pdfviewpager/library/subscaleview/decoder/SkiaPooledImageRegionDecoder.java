package es.voghdev.pdfviewpager.library.subscaleview.decoder;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l7.x1;
import t61.c;
import t61.d;

/* loaded from: /home/user/work/p/classes4.dex */
public class SkiaPooledImageRegionDecoder implements c {
    public final Bitmap.Config c;
    public Context d;
    public Uri e;
    public x1 a = new x1(25);
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock(true);
    public long f = Long.MAX_VALUE;
    public final Point g = new Point(0, 0);
    public final AtomicBoolean h = new AtomicBoolean(false);

    @Keep
    public SkiaPooledImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.c = preferredBitmapConfig;
        } else {
            this.c = Bitmap.Config.RGB_565;
        }
    }

    @Keep
    public static void setDebug(boolean z) {
    }

    @Override // t61.c
    public final synchronized boolean a() {
        boolean z;
        boolean isEmpty;
        x1 x1Var = this.a;
        if (x1Var != null) {
            synchronized (x1Var) {
                isEmpty = ((ConcurrentHashMap) x1Var.s).isEmpty();
            }
            z = isEmpty ? false : true;
        }
        return z;
    }

    @Override // t61.c
    public final synchronized void b() {
        this.b.writeLock().lock();
        try {
            x1 x1Var = this.a;
            if (x1Var != null) {
                synchronized (x1Var) {
                    while (!((ConcurrentHashMap) x1Var.s).isEmpty()) {
                        BitmapRegionDecoder h = x1Var.h();
                        h.recycle();
                        ((ConcurrentHashMap) x1Var.s).remove(h);
                    }
                }
                this.a = null;
                this.d = null;
                this.e = null;
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // t61.c
    public final Point c(Context context, Uri uri) {
        this.d = context;
        this.e = uri;
        e();
        return this.g;
    }

    @Override // t61.c
    public final Bitmap d(int i, Rect rect) {
        Objects.toString(rect);
        Thread.currentThread().getName();
        int width = rect.width();
        Point point = this.g;
        if ((width < point.x || rect.height() < point.y) && this.h.compareAndSet(false, true) && this.f < Long.MAX_VALUE) {
            new d(0, this).start();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.b;
        reentrantReadWriteLock.readLock().lock();
        try {
            x1 x1Var = this.a;
            if (x1Var != null) {
                BitmapRegionDecoder h = x1Var.h();
                if (h != null) {
                    try {
                        if (!h.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i;
                            options.inPreferredConfig = this.c;
                            Bitmap decodeRegion = h.decodeRegion(rect, options);
                            if (decodeRegion != null) {
                                return decodeRegion;
                            }
                            throw new RuntimeException("null bitmap - image format may not be supported");
                        }
                    } finally {
                        x1.f(this.a, h);
                    }
                }
                if (h != null) {
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public final void e() {
        BitmapRegionDecoder bitmapRegionDecoder;
        int i;
        String uri = this.e.toString();
        long j = Long.MAX_VALUE;
        if (uri.startsWith("android.resource://")) {
            String authority = this.e.getAuthority();
            Resources resources = this.d.getPackageName().equals(authority) ? this.d.getResources() : this.d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = this.e.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
            }
            try {
                j = this.d.getResources().openRawResourceFd(i).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.d.getResources().openRawResource(i), false);
        } else if (uri.startsWith("file:///android_asset/")) {
            String substring = uri.substring(22);
            try {
                j = this.d.getAssets().openFd(substring).getLength();
            } catch (Exception unused3) {
            }
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(this.d.getAssets().open(substring, 1), false);
        } else if (uri.startsWith("file://")) {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(uri.substring(7), false);
            try {
                File file = new File(uri);
                if (file.exists()) {
                    j = file.length();
                }
            } catch (Exception unused4) {
            }
            bitmapRegionDecoder = newInstance;
        } else {
            InputStream inputStream = null;
            try {
                ContentResolver contentResolver = this.d.getContentResolver();
                inputStream = contentResolver.openInputStream(this.e);
                BitmapRegionDecoder newInstance2 = BitmapRegionDecoder.newInstance(inputStream, false);
                try {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.e, "r");
                    if (openAssetFileDescriptor != null) {
                        j = openAssetFileDescriptor.getLength();
                    }
                } catch (Exception unused5) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                bitmapRegionDecoder = newInstance2;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused7) {
                    }
                }
                throw th;
            }
        }
        this.f = j;
        this.g.set(bitmapRegionDecoder.getWidth(), bitmapRegionDecoder.getHeight());
        this.b.writeLock().lock();
        try {
            x1 x1Var = this.a;
            if (x1Var != null) {
                synchronized (x1Var) {
                    ((ConcurrentHashMap) x1Var.s).put(bitmapRegionDecoder, Boolean.FALSE);
                    ((Semaphore) x1Var.r).release();
                }
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

}
