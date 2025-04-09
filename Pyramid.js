function printPyramid(rows) {
  for (let i = 1; i <= rows; i++) {
    let str = '';

    // Add spaces
    for (let space = 1; space <= rows - i; space++) {
      str += ' ';
    }

    // Ascending characters
    for (let j = 0; j < i; j++) {
      str += String.fromCharCode(65 + j);
    }

    
    // Descending characters
    for (let j = i - 2; j >= 0; j--) {
      str += String.fromCharCode(65 + j);
    }

    console.log(str);
  }
}

let rows = 10;
printCharacterPyramid(rows);