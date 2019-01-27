
const bruce = { name: 'bruce' };
const madeline = { name: 'madeline' };

function greeting() {
	return 'helllo, i am ${this.name}';
}

function update(birth, occupation) {
	this.birth = birth;
	this.occupation = occupation;
}

greeting();
greeting.call(bruce);
greeting.call(madeline);

update.call(bruce, 2000, 'singer');
update.call(madeline, 2001, 'student');

update.apply(bruce, [2000, 'singer']);
update.apply(madeline, [2001, 'student']);

const updateBruce = update.bind(bruce);
updateBruce(2000, 'singer');
updateBruce.call(madeline, 2001, 'student');