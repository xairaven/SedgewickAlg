package Chapter1.Section3;
import  edu.princeton.cs.algs4.Queue;
import  java.io.File;

/**
 * Ex. 1.3.43 <br>
 * 10.06.2022
 * @author xairaven
 */
public class Task_43 {
    public static void main(String[] args) {
        System.out.println("-- Exercise 1.3.43 --");

        final String folderPath = args[0];
        File folder = new File(folderPath);

        getFileList(folder);
        for (String file : q) {
            System.out.println(file);
        }
    }

    private static final Queue<String> q = new Queue<>();

    private static void getFileList(File file) {
        getFileList(file, 0);
    }

    private static void getFileList(File file, int depth) {
        if (!file.exists()) return;

        int localDepth = (depth == 0) ? 0 : depth - 1;
        q.enqueue("\t".repeat(localDepth) + file.getName());

        File[] fileList = file.listFiles();

        if (fileList != null) {
            for (File fileItem : fileList) {
                if (fileItem.isFile()) {
                    q.enqueue("\t".repeat(depth) + fileItem.getName());
                } else if (fileItem.isDirectory()) {
                    getFileList(fileItem, depth + 1);
                }
            }
        }
    }
}

/*
Input example (command prompt):
D:\ASM

Result example:
ASM
DPMI16BI.OVL
DPMILOAD.EXE
DPMIMEM.DLL
Lab8.asm
RTM.EXE
TASM.EXE
TD NEW
	sdsd
		asd.txt
	TD.EXE
	TDINST.EXE
	turbodebugger5.5.exe
TD.EXE
TDCONFIG.TD
TLINK.EXE
 */