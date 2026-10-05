package es.voghdev.pdfviewpager.library.service;

import android.app.IntentService;
import android.content.Intent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/user/work/p/classes4.dex */
public class CopyAssetService extends IntentService {
    public CopyAssetService() {
        super("CopyAssetService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"es.voghdev.pdfviewpager.library.copy_asset".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("es.voghdev.pdfviewpager.library.asset");
        String stringExtra2 = intent.getStringExtra("es.voghdev.pdfviewpager.library.destination_path");
        try {
            InputStream open = getAssets().open(stringExtra);
            new File(stringExtra2).createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(stringExtra2));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    open.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
