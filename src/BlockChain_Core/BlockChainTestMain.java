package BlockChain_Core;

import BlockChain_Util.Util;

public class BlockChainTestMain {

	public static void main(String[] args) {
		System.out.println(Util.getHash("31191320"));
		
		/*
		int nonce = 0;
		int ten = 300000;

		while (true) {
			if (Util.getHash(nonce + "").substring(0, 7).equals("abcdefg")) {
				System.out.println("정답 : " + nonce);
				break;
			}
			nonce++;
			if ((nonce % ten) == 0) {
				System.out.println("현재 nonce 값 : " + nonce);
			}
		}
		*/
		
		Block block = new Block(1, null, 0, "데이터");
		block.mine();
		block.getInformation();
		
		Block block1 = new Block(2, block.getBlockHash(), 0, "데이터");
		block1.mine();
		block1.getInformation();
		
		Block block2 = new Block(3, block1.getBlockHash(), 0, "데이터");
		block2.mine();
		block2.getInformation();
		
		Block block3 = new Block(4, block2.getBlockHash(), 0, "데이터");
		block3.mine();
		block3.getInformation();
		
		Block block4 = new Block(5, block3.getBlockHash(), 0, "데이터");
		block4.mine();
		block4.getInformation();
	}

}
