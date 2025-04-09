function printPyramid(rows) {
  for (let i = 1; i <= rows; i++) {
    let str = '';

    // Add spaces
    for (let space = 1; space <= rows - i; space++) {
      str += ' ';
    }

    for (let j = 0; j < i; j++) {
      str += String.fromCharCode(65 + j);
    }
  }
}