<?php 

class Novel {
	public $judul = "judul",
		   $penulis = "penulis",
		   $tahunterbit = "tahunterbit",
		   $hargabeli = "hargabeli",
		   $hargajual = "hargajual";

	public function __construct( $judul, $penulis, $tahunterbit, $hargabeli, $hargajual){
		$this->judul = $judul;
		$this->penulis = $penulis;
		$this->tahunterbit = $tahunterbit;
		$this->hargabeli = $hargabeli;
		$this->hargajual = $hargajual; 
	}

	public function getLabel() {
		return "$this->judul, $this->penulis, $this->tahunterbit, $this->hargabeli, $this->hargajual";
	}
}

$novel1 = new Novel("The Hound of the Baskervilles", "Sir Arthur Conan Doyle", "1902", "50000", "40000");
$novel2 = new Novel("The Big Sleep", "Raymond Chandler", "1939", "35000", "28000");
$novel3 = new Novel("The Maltese Falcon", "Dashiell Hammet", "1929", "40000", "32000");

echo "Novel 1 :" . $novel1->getLabel();
echo "<br>";
echo "Novel 2 :" . $novel2->getLabel();
echo "<br>";
echo "Novel 3 :" . $novel3->getLabel();